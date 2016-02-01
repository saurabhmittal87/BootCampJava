package ttnd.bootcamp.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author saurabh
 */
public class ByteStreamExample {
    
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("/home/saurabh/example/file1.txt");
            out = new FileOutputStream("/home/saurabh/example/file2.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
            }
        finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
