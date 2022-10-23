package myinterface1;

public interface myinterface {
    // 常量
    String LED = "LED";

    // 抽象方法
    int getElectricityUse();

    // 静态方法
    static boolean isEnergyEfficient(String electtronicType) {
        return electtronicType.equals(LED);
    }

    // 默认方法
    default void printDescription() {
        System.out.println("电子");
    }
}


/*
* 1. 接口中定义的所有变量或者方法，都会自动添加上 public 关键字；
* 2. 接口中定义的变量会在编译的时候自动加上 public static final 修饰符（相当于常量）；
* 3. 没有使用 private、default 或者 static 关键字修饰的方法是隐式抽象的，在编译的时候会自动加上 public abstract 修饰符。
* 4. 从java8开始，接口中允许有静态方法；
*    静态方法只能通过接口名来调用，例如Electronic.isEnergyEfficient("LED")；
*    接口中定义静态方法的目的是为了提供一种简单的机制，使我们不必创建对象就能调用方法，从而提高接口的竞争力；
* 5. 接口中允许定义 default 方法也是从Java 8 开始的。为实现该接口而不覆盖该方法的类提供默认实现；
* 6. 接口不允许直接实例化，否则编译器会报错
* 7. 接口可以是空的
* */