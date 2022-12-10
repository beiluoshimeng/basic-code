package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class my_IO {
    public static void main(String[] args) {
        file_IO();
    }

    public static void file_IO(){
        int b;

        try {
            FileInputStream fis1 = new FileInputStream("E:\\my_java\\Projects\\basic-code\\10IO\\src\\IO\\aq.txt");

            while ((b = fis1.read())!=-1) {         //当流结束时返回-1
                System.out.println((char) b);
            }
            fis1.close();
        } catch (IOException e) {
            e.printStackTrace();
            // handle exception correctly.
        }

        try{
            FileOutputStream fos = new FileOutputStream("E:\\my_java\\Projects\\basic-code\\10IO\\src\\IO\\aq.txt", true);
            fos.write("nana".getBytes());
            fos.close();

        }catch (IOException e){
            e.printStackTrace();
        }


    }


}
