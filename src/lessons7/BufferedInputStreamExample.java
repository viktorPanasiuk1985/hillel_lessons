package lessons7;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamExample {

    public static void main(String[] args) {
        long time1 = System.nanoTime();
        readBuffered();
        long time2 = System.nanoTime();
        System.out.println("read with buffer = " + (time2 - time1));


        long time1no = System.nanoTime();
        readNoBuffered();
        long time2no = System.nanoTime();
        System.out.println("read without buffer = " + (time2no - time1no));
    }

    private static void readNoBuffered() {
        try (FileInputStream file = new FileInputStream("input.txt"))  {
            // Creates a FileInputStream

            // Reads first byte from file
            int i = file.read();

            while (i != -1) {
                System.out.print((char) i);

                // Reads next byte from the file
                i = file.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void readBuffered() {
        try {

            // Creates a FileInputStream
            FileInputStream file = new FileInputStream("input2.txt");

            // Creates a BufferedInputStream
            BufferedInputStream input = new BufferedInputStream(file);

            // Reads first byte from file
            int i = input.read();

            while (i != -1) {
                System.out.print((char) i);

                // Reads next byte from the file
                i = input.read();
            }
            file.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
