package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class my_LinkedList {
    LinkedList<String> my_aq = new LinkedList<>();  //可指定大小，默认为10

    public static void main(String[] args) {
        my_LinkedList aq = new my_LinkedList();
        aq.my_aq.add("1998");   //从链尾插入
        aq.my_aq.add("9");
        aq.my_aq.add("4");
        aq.my_aq.addFirst("birthday");  //插到链头
        aq.my_aq.addLast("yang");

        /*删
        * remove()：删除第一个节点
        * remove(int)：删除指定位置的节点
        * remove(Object)：删除指定元素的节点
        * removeFirst()：删除第一个节点
        * removeLast()：删除最后一个节点
        * */

        aq.my_aq.set(4,"aq&yang");     //更新指定位置元素（从两端找位置）


        System.out.println(aq.my_aq.indexOf("aq&yang"));  //查找某个元素所在的位置
        System.out.println(aq.my_aq.get(0));    //查找某个位置上的元素
        for (String s:aq.my_aq
             ) {
            System.out.println(s);
        }

        for (Iterator<String> it = aq.my_aq.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }

        /*查相关
        * getFirst() 方法用于获取第一个元素；
        * getLast() 方法用于获取最后一个元素；
        * poll() 和 pollFirst() 方法用于删除并返回第一个元素（两个方法尽管名字不同，但方法体是完全相同的）；
        * pollLast() 方法用于删除并返回最后一个元素；
        * peekFirst() 方法用于返回但不删除第一个元素。
        * */



    }
}
