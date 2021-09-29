import com.sun.tools.attach.AgentLoadException;

public class Person {
    private String id;
    private String name;
    private String sex;
    private int age;
    public String getId(){
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgentLoadException {
        if (age<0||age>200) throw new AgentLoadException();
        this.age = age;
    }
    public Person(){
        this.id=id;
        this.name=name;
        this.sex=sex;
        this.age = age;
    }

    public static void main(String[] args) {

    }
}
class AgeException extends Exception{
    public AgeException(){
        super("年龄超过范围");
    }
    public AgeException(String message){
        super(message);
    }
    public static void main(String[] args){
        Person p=new Person();
        try {
            p.setAge(300);
        } catch (AgentLoadException e) {
            System.out.println("给age赋值错误:"+e.getMessage());
        }
    }
}
