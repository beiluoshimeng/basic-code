package HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class my_HashMap {
    HashMap<String, String> aq_yang = new HashMap<>();
    /*LinkedHashMap
    * 1. 可维持插入顺序
    * 2. 三个参数LinkedHashMap<>(16, .75f, true); 初始容量，负载因子，维护访问顺序:最近最少使用（默认为false）
    * */
    LinkedHashMap<String, String> aq = new LinkedHashMap<>(16, .75f, true);

    //TreeMap 维持键值的自然顺序

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

        family.aq.put("love", "blsm");
        family.aq.put("love2", "xiaoyang");
        family.aq.put("love3", "yjq");

        //最近最少使用
        System.out.println(family.aq);

        family.aq.get("love2");
        System.out.println(family.aq);

        family.aq.get("love3");
        System.out.println(family.aq);


    }
}
