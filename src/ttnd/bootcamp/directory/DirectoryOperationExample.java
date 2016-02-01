package ttnd.bootcamp.directory;

import java.io.File;
import ttnd.bootcamp.service.CommonService;

public class DirectoryOperationExample {

   public void createDirectory(String directoryName){
       
       Boolean directoryCreated = CommonService.createFile(directoryName);
       if(directoryCreated)
           System.out.println("Directory Created Successfullly");
       else
           System.out.println("Either directory already exists or an exception occured");
   }
   
   public void deleteDirectory(String completeDirectoryPath){
       File file = new File(completeDirectoryPath);
       if(!file.exists()){
           System.out.println("Directory doesn't exist");
       }
       else if(!file.isDirectory()) {
           System.out.println("Invalid directory path");
       }
       else {
           file.delete();
           System.out.println("Directory Deleted");
       }
   }
   
    public static void main(String[] args) {
        DirectoryOperationExample directoryOperationExample = new DirectoryOperationExample();
        
        directoryOperationExample.createDirectory(CommonService.homeDirectory + "testfolder2");
        directoryOperationExample.deleteDirectory(CommonService.homeDirectory + "testfolder2");
    }
}
