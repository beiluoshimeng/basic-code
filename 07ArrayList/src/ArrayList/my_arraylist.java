package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class my_arraylist {
    //ArrayList<String> aq_yang = new ArrayList<String>();
    List<String> aq_yang = new ArrayList<>(20);   //可指定初始大小（默认10），避免不必要的扩容（i+i/2）

    public static void main(String[] args) {
        my_arraylist myList = new my_arraylist();
        myList.aq_yang.add("aq");   //添加元素，默认末尾
        myList.aq_yang.add(1,"yang");    //添加元素，指定位置（使用System.arraycopy()，它会对数组进行复制（要插入位置上的元素往后复制）。）

        myList.aq_yang.add("meet");
        myList.aq_yang.set(2,"love");   //更新元素

        //删除元素，后面的自动前移System.arraycopy()
        myList.aq_yang.remove(0);   //删除元素（按照下标）
        myList.aq_yang.remove("yang");  //删除元素（按照元素）

        myList.aq_yang.add("aq&yang");
        myList.aq_yang.indexOf("love");     //正序查找
        myList.aq_yang.lastIndexOf("love");     //倒叙查找
    }
}
