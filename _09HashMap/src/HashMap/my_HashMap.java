package HashMap;

import java.util.HashMap;

public class my_HashMap {
    HashMap<String, String> aq_yang = new HashMap<>();

    public static void main(String[] args) {
        my_HashMap family = new my_HashMap();

        //添加元素
        family.aq_yang.put("1", "yang");
        family.aq_yang.put("2", "aq");

        //访问
        System.out.println(family.aq_yang.get("1"));
        //删除 remove(key)
        
        //迭代
        for (String s:family.aq_yang.keySet()
             ) {
            System.out.println(s + " " + family.aq_yang.get(s));
        }
    }
}
