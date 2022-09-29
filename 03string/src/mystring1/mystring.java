package mystring1;

import java.util.Objects;

/**
 * 1. String source code
 * 2. String 类是 final 的，意味着它不能被子类继承。
 * 3. String 类实现了 Serializable 接口，意味着它可以序列化。
 * 4. String 类实现了 Comparable 接口，意味着最好不要用‘==’来比较两个字符串是否相等，而应该用 compareTo() 方法去比较。
 * 5. 每一个字符串都会有一个 hash 值，这个哈希值在很大概率是不会重复的，因此 String 很适合来作为 HashMap 的键值
 * 6. String 的不可变性 (安全性、hash 值不变、 实现字符串常量池)
 * 7. 由于字符串的不可变性，String 类的一些方法实现最终都返回了新的字符串对象（操作执行过后，原来的字符串对象并没有发生改变。）
 *
 * public final class String
 *      implements java.io.Serializable, Comparable<String>, CharSequence {
 *      @Stable
 *      private final byte[] value;
 *     private final byte coder;
 *    private int hash;
}
 */

public class mystring {
    public static void main(String[] args) {
        //string_table();
        //string_equ();
        //string_append();
        string_split();

    }

    public static void string_table(){

        /*
         * 字符串常量池
         * 本质上是一个固定大小的 StringTable，如果放进去的字符串过多，就会造成严重的哈希冲突，从而导致链表变
        */

        //创建了两个字符串对象（现在字符串常量池中查找是否有，若无先在字符串常量池中创建，再在堆中创建赋值）
        String s = new String("yang");

        String ss = "nana";     //不会在堆中创建
        System.out.println(s);
        System.out.println(ss);

        String s1 = new String("yang&nana");    //s1 引用的是堆中的对象(字符串常量池中也会创建一个)
        String s2 = s1.intern();    //s2 引用的是字符串常量池中的对象
        System.out.println(s1 == s2);   //false

        String s3 = new String("yang") + new String("nana");    //s3 引用的是堆
        String s4 = s1.intern();    //s4 引用的是堆(字符串常量池中并没有"yangnana")
        System.out.println(s3 == s4);
    }

    public static void string_equ(){

        /*判断字符串是否相等
        * 1. ==        比较地址
        * 2. .equals() 比较值 若空会抛出异常
        * 3. Objects.equals() 比较值 不会先判空
        * 4. .contentEquals() 可以将字符串与任何的字符序列（StringBuffer、StringBuilder、String、CharSequence）进行比较。
        *
        * 事实上Java 的所有类都默认地继承 Object 这个超类，该类有一个名为 .equals() 的方法。
        * public boolean equals(Object obj) {
        *   return (this == obj);
        * }
        * 假如子类没有重写该方法的话，那么“==”操作符和 .equals() 方法的功效就完全一样——比较两个对象的内存地址是否相等
        * */

        String s1 = new String("yang");
        String s2 = new String("yang");

        System.out.println(s1.equals(s2)); // true 比较值
        System.out.println(s1 == s2); // false 比较地址

        System.out.println(Objects.equals("yangnana", new String("yang" + "nana"))); // --> true
        System.out.println(Objects.equals(null, new String("yang" + "nana"))); // --> false
        System.out.println(Objects.equals(null, null)); // --> true

        String a = null;
        a.equals(new String("yang" + "nana")); // throw exception

    }

    public static void string_append(){

        /*
         * 循环体内，拼接字符串最好使用 StringBuilder 的 append() 方法，而不是 + 号操作符。
         * 用 + 号操作符的话，就会产生大量的 StringBuilder 对象，不仅占用了更多的内存空间，
         * 还会让 Java 虚拟机不同的进行垃圾回收，从而降低了程序的性能
         *
         * 其他：concat(); join();
         * */

        StringBuilder s = new StringBuilder();
        for (int i = 1; i < 10; i++) {
            String s1 = "yang";
            String s2 = "aqi";
            s.append(s1);
            s.append(s2);
        }
        System.out.println(s);
    }

    public static void string_split(){

        /*
         * split();
         * 传递 2 个参数，第一个为分隔符，第二个为拆分的字符串个数
         * */

        String s = "yang,aq,love";
        if (s.contains(",")) {
            String [] parts = s.split(",", 2);
            System.out.println("first part: " + parts[0] +" second part: " + parts[1]);
        } else {
            throw new IllegalArgumentException("No ,");
        }
        //断言 有四种
        if (s.contains(",")) {
            String [] parts = s.split("(?<=,)", 3);
            System.out.println("first part: " + parts[0] +" second part: " + parts[1]+" third part: " + parts[2]);
        }

    }
}
