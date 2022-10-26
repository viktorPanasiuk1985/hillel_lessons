package lessons7;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class EncodingProblem {

    public static void main(String[] args) {
        write();
        read();
    }

    private static void read() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                new FileInputStream("filename.txt")))) {
            System.out.println(reader.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void write() {
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("filename.txt"), StandardCharsets.UTF_8))) {
            writer.write("екцецу");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
