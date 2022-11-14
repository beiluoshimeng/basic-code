package nested_class;

public class nested_class {
    public static void main(String[] args) {
        family aq_and_y = new family();
        aq_and_y.who();
    }
}

class family{
    String name = "tang & yang";

    public static void who() {
        family aq_and_yang = new family();
        aq aq = aq_and_yang.new aq();
        aq.print();
    }

    //成员内部类
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