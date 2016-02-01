package ttnd.bootcamp.formatting;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author saurabh
 */
public class ScannerExample {
    public void scannerWithBufferedReader() {

        Scanner s = null;
        try {
            s = new Scanner(new BufferedReader(new FileReader("xanadu.txt")));

            while (s.hasNext()) {
                System.out.println(s.next());
            }
        }
        catch(IOException ioe) {
            System.out.println("IOException occured");
        }
        finally {
            if (s != null) {
                s.close();
            }
        }
    }
    
    public void scannerWithSystem() {

        Scanner s = null;
        try {
            s = new Scanner(System.in);
            System.out.println("Enter string: ");
            String enteredString = s.next();
            System.out.println("Entered string: " + enteredString);
        }
        catch(Exception ioe) {
            System.out.println("Exception occured");
        }
        finally {
            if (s != null) {
                s.close();
            }
        }
    }
    
    public static void main(String[] args) {
        ScannerExample scannerExample = new ScannerExample();
        
        scannerExample.scannerWithBufferedReader();
        scannerExample.scannerWithSystem();
    }
}
