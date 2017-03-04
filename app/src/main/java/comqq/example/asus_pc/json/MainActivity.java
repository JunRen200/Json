package comqq.example.asus_pc.json;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    private TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt= (TextView) findViewById(R.id.txt);
        Student stu1= new Student(101,"a1","18","nan");
       // String str="{\"id\":\"101\",\"name\":\"a1\",\"age\":\"18\",\"sex\":\"nan\"}";
        String str="{id:101,name:a1,age:18,sex:nan}";
        JSONObject jsonObject = new JSONObject();

        JSONObject dataelem1=new JSONObject();
        //{"deviceid":"SH01H20130002","latitude":"32.140","longitude":"118.640","speed":"","orientation":""}
        try {
            dataelem1.put("id", "101");
            dataelem1.put("name", "a1");
            dataelem1.put("age", "11");
            dataelem1.put("sex", "nan");
            JSONObject dataelem2=new JSONObject();
            //{"deviceid":"SH01H20130002","latitude":"32.140","longitude":"118.640","speed":"","orientation":""}
            dataelem2.put("id", "102");
            dataelem2.put("name", "a2");
            dataelem2.put("age", "12");
            dataelem2.put("sex", "woman");
            JSONArray jsonArray = new JSONArray();

            jsonArray.put(dataelem1);
            jsonArray.put(dataelem2);
            jsonObject.put("date",jsonArray);
            Gson gson =new Gson();
            Student stu=gson.fromJson(dataelem2.toString(),Student.class);
            //String id= (String) jsonObject.getJSONArray("date").getJSONObject(0).get("id");
            txt.setText(stu.getName()+"");
        } catch (JSONException e) {
            e.printStackTrace();
        }




        // 返回一个JSONArray对象



    }
}
