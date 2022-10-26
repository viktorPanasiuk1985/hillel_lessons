package lessons7;

import java.io.*;

public class DataInputExample {
    public static void main(String a[]) {
        InputStream is = null;
        BufferedInputStream bis = null;
        DataInputStream dis = null;
        try {
            is = new FileInputStream("src/lessons7/data.txt");
            bis = new BufferedInputStream(is);
            dis = new DataInputStream(bis);
            while (dis.available() > 0) {
                System.out.println(dis.readInt());
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
