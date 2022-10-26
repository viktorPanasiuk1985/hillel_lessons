package lessons7;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativePathExample {
    public static void main(String[] args) throws IOException {
        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();
        System.out.println("Current absolute path is: " + s);

        FileInputStream inputStream = new FileInputStream("src/lessons7/data.txt");
        InputStream inputStream1 = new BufferedInputStream(inputStream);

        long sum = 0;

        while (inputStream.available() > 0)
        {
            int data = inputStream.read();
            sum += data;
        }
        inputStream.close();

        System.out.println(sum);
    }

}
