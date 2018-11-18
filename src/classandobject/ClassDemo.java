package classandobject;

public class ClassDemo {
    String name;
    int age;

    ClassDemo(String name, int age){
        this.name = name;
        this.age = age;
    }
    void show(){
        System.out.println("姓名：" + name + "年龄：" + age);
    }
    public static void main(String arg[]){
        new ClassDemo("qi",21).show();
    }
}
