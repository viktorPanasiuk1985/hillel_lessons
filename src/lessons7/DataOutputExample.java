package lessons7;

import java.io.*;

public class DataOutputExample {
    public static void main(String a[]) {
        OutputStream is = null;
        BufferedOutputStream bis = null;
        DataOutputStream dis = null;
        try {
            is = new FileOutputStream("src/lessons7/data2.txt");
            bis = new BufferedOutputStream(is);
            dis = new DataOutputStream(bis);
            dis.writeInt(23);
            dis.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }




}
