package ttnd.bootcamp.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author saurabh
 */
public class FileExample {

    public void readAndPrintFile(String filePath){
        
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(new FileReader(file));
            while(scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("FileNotFoundException occured");
        }
    }
    
    public void writeFile(String filePath){
        
        try {
            File file = new File(filePath);
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Dummy Text");
            fileWriter.close();
        } catch (IOException ex) {
            System.out.println("IOException occured");
        }
    }
    
     public void createFile(String filePath){
        
        try {
            File file = new File(filePath);
            file.createNewFile();
        } catch (IOException ex) {
            System.out.println("IOException occured");
        }
    }
    
    public static void main(String[] args) {
        
        FileExample readFileExample = new FileExample();
        
        readFileExample.readAndPrintFile("/home/saurabh/dummyText.txt");
        readFileExample.createFile("/home/saurabh/dummyText2.txt");
        readFileExample.writeFile("/home/saurabh/dummyText2.txt");
    }
}
