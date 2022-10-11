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
        System.out.println(person.name);

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
    public String name;
    public int age;
    public int sex;

    /*构造方法
   1. 构造方法的名字必须和类名一样；
   2. 构造方法没有返回类型，包括 void；
   3. 构造方法不能是抽象的、静态的、最终的、同步的，也就是说，构造方法不能通过 abstract、static、final、synchronized 关键字修饰。
   解释3：由于构造方法不能被子类继承，所以用 final 和 abstract 修饰没有意义；
         构造方法用于初始化一个对象，所以用 static 修饰没有意义；
         多个线程不会同时创建内存地址相同的同一个对象，所以用 synchronized 修饰没有必要。

    默认构造方法（无参构造方法）：
    1. 如果一个构造方法中没有任何参数，那么它就是一个默认构造方法，也称为无参构造方法。
    2. 目的主要是为对象的字段提供默认值
    有参构造方法：
    1. 有参数的构造方法被称为有参构造方法，参数可以有一个或多个。
    2. 有参构造方法可以为不同的对象提供不同的值。有参数的构造方法被称为有参构造方法，参数可以有一个或多个。有参构造方法可以为不同的对象提供不同的值。
    */
    public Person(String name, int age, int sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    private void eat() {}
    private void sleep() {}
    private void play() {}
}


/*
* 抽象类
* 1. 不能实例化；
* 2. 可以有子类：通过extends关键字来继承抽象类；
* 3. 只有在抽象类中能够定义抽象方法,抽象类应该至少有一个抽象方法，否则它没有任何意义;
* 4. 抽象类中的抽象方法没有方法体;
* 5. 抽象类的子类必须给出父类中的抽象方法的具体实现，除非该子类也是抽象类。
*
* 抽象类应用场景：
* 1. 希望一些通用的功能被多个子类复用；
* 2. 在抽象类中定义好 API，然后在子类中扩展实现的时候就可以使用抽象类。
* */
abstract class AbstractLover {
    protected String p1;
    protected  String p2;

    protected  AbstractLover(String p1, String p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    abstract void fall_in_love();

    public void friend() {
        System.out.println("We are friend now.");
    }
}

class Yang_aq extends AbstractLover {

    protected  Yang_aq(String p1, String p2){
        super(p1, p2);
    }
    @Override
    void fall_in_love() {
        System.out.println("We are cp now.");
    }
}