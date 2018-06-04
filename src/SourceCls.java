/**
 * Created by MANU on 2018/6/4.
 */
public class SourceCls {
    private String name;
    private int age;
    private String sex;

    public SourceCls(String nStr,int aInt, String sStr){
        name = nStr;
        age = aInt;
        sex = sStr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
