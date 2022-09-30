package myclass1;

/**
 *一个类包含：
 * 1. 字段（Filed），成员变量（也称事例变量；方法外部，方法内部称为临时变量）；
 * 2. 方法（Method）
 * 3. 构造方法（Constructor）
 */


public class myclass {
    int b = 10;             //成员变量，当一个对象被实例化之后，每个成员变量的值就跟着确定;
    static int c = 10;      //静态变量：通过类名.静态变量 就可以访问了，不需要创建类的实例。
    final String S = "yang & aq";   //常量：常量名必须大写

    public static void main(String[] args) {
        //new关键字：创建对象
        Person person = new Person("yang",23,1);

        int a = 10;     //局部变量：方法内部，必须初始化

        myclass test = new myclass();
        System.out.println(test.add(1,2));
        System.out.println(add2(1,2));

    }

    //实例方法：没有使用 static 关键字修饰，但在类中声明的方法被称为实例方法，在调用实例方法之前，必须创建类的对象。
    public int add(int a, int b) {
        return a + b;
    }

    //静态方法：可直接调用
    public static int add2(int a, int b) {
        return a + b;
    }

    //抽象方法，它总是在抽象类中声明。当一个类继承了抽象类后，就必须重写抽象方法. atstract 关键字
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