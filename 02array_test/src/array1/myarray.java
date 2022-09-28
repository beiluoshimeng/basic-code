package array1;

import java.util.Arrays;

public class myarray {
    public int[] array;
    public String[] str;

    public static void main(String[] args) {
        myarray a = new myarray(), b = new myarray();
        a.array = new int[3];
        b.array = new int[] {3, 6, 7, 9, 8};

        get_array(a.array);
        arrlib(b.array);

        //tostring 打印二维数组
        a.str = new String[] {"yang", "nana"};
        System.out.println(Arrays.deepToString(a.str));
    }

    public static void get_array(int[] a) {
        for(int i = 0; i < a.length; i++){
            a[i] = i;
            System.out.printf("%d ", a[i]);
        }
        System.out.println();

        for (int element : a) {
            System.out.printf("%d ", element);
        }
        System.out.println();

        //stream
        Arrays.stream(a).forEach(System.out::println);

        //用tostring来打印数组
        System.out.println(Arrays.toString(a));
    }

    public static void arrlib(int[] a){
        Arrays.sort(a);
        for(int element : a){
            System.out.printf("%d ", element);
        }
        System.out.println();
    }

}
