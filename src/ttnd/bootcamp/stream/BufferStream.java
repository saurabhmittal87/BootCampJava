package ttnd.bootcamp.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author saurabh
 */
public class BufferStream {

    public static void main(String args[]) throws IOException {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            bis = new BufferedInputStream(new FileInputStream("/home/saurabh/example/file1.txt"));
            bos = new BufferedOutputStream(new FileOutputStream("/home/saurabh/example/file2.txt"));
            int data;
            while ((data = bis.read()) != -1) {
                bos.write(data);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (bis != null) {
                bis.close();
            }
            if (bos != null) {
                bos.close();
            }
        }
    }
}
