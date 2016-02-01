package ttnd.bootcamp.service;

import java.io.File;
import java.io.IOException;

/**
 * @author saurabh
 */
public class CommonService {
    
   public static String homeDirectory = System.getProperty("user.home") + "/";
   
   
    public static Boolean createFile(String directoryName){
        File file = new File(homeDirectory + directoryName);
         System.out.println(file.getAbsoluteFile());
        if(!file.exists()){  System.out.println(file.getAbsoluteFile());
            try {
                if(directoryName.contains("."))
                    file.createNewFile();
                else
                    file.mkdirs();
                return true;
            } catch (IOException ex) {
                System.out.println("IO Exception");
            }
        }
        return false;    
    }
}
