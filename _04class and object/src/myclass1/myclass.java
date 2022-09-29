package myclass1;

/**
 *一个类包含：
 * 1. 字段（Filed），成员变量（也称事例变量；方法外部，方法内部称为临时变量）；
 * 2. 方法（Method）
 * 3. 构造方法（Constructor）
 */


public class myclass {
    public static void main(String[] args) {
        //new关键字：创建对象
        Person person = new Person("yang",23,1);

    }
}

class Person {
    private String name;
    private int age;
    private int sex;

    public Person(String name, int age, int sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    private void eat() {}
    private void sleep() {}
    private void play() {}
}