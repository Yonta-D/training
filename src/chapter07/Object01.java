package chapter07;

public class Object01 {
    public static void main(String[] args) {
        Person a = new Person();
        a.age=10;
        a.name = "小明";
        Person b;
        b=a;
        System.out.println(b.name);//小明
        b.age=200;
        b=null;//会将栈中b对象所指向的地址置空，此时指向堆的只有a对象
        System.out.println(a.age);//200
        System.out.println(b.age);//空指针异常
    }
}
 class Person {
    String name;
    int age;
}
