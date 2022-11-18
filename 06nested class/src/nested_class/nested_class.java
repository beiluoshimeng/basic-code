package nested_class;


/*
* 1、使用匿名内部类时，我们必须是继承一个类或者实现一个接口，但是两者不可兼得，同时也只能继承一个类或者实现一个接口。
* 2、匿名内部类中是不能定义构造函数的。
* 3、匿名内部类中不能存在任何的静态成员变量和静态方法。
* 4、匿名内部类为局部内部类，所以局部内部类的所有限制同样对匿名内部类生效。
* 5、匿名内部类不能是抽象的，它必须要实现继承的类或者实现的接口的所有抽象方法。
* */


public class nested_class {
    public static void main(String[] args) {
        family aq_and_y = new family();
        aq_and_y.who();

        //匿名类
        f(new thing(){
            @Override
            public void ml(){
                System.out.println("pp");
            }
        });
    }

    public static void f(thing a){
        a.ml();
    }
}

class family{
    String name = "tang & yang";

    public static void who() {
        family aq_and_yang = new family();
        aq aq = aq_and_yang.new aq();
        aq.print();
        hh h = new hh();
        h.ml();

        //匿名类
        hh hhh = new hh(){
            public void ml() {
                System.out.println("pp");
            }
        };
        hhh.ml();
    }

    //成员内部类(静态内部类不能访问外部类的非静态变量和方法)
    class aq{
        int sex = 0;
        String aq_name = "aq";
        public void print(){
            //局部内部类
            class aq_bf{
                private String bf_name = "yang";
            }
            aq_bf aq_bf = new aq_bf();
            System.out.println(name);
            System.out.println(aq_name);
            System.out.println(aq_bf.bf_name);
        }
    }
}

interface thing{
    public void ml();
}
//不用匿名类
class hh implements thing{
    @Override
    public void ml() {
        System.out.println("pp");
    }
}
