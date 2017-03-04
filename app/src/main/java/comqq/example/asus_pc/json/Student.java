package comqq.example.asus_pc.json;

/**
 * Created by asus-pc on 2017/3/3.
 */

public class Student {
    private  int id;
    private String name;
    private String age;
    private String sex;
    Student(int id,String name, String age,String sex){
        this.id=id;
        this.name=name;
        this.age=age;
        this.sex=sex;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

}
