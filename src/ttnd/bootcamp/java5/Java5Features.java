package ttnd.bootcamp.java5;

/**
 * @author saurabh
 */
public class Java5Features {

    public void autoboxingExample(){
        Double doubleObject = new Double(12);
        double doubleVariable = doubleObject;
        
        System.out.println("doubleObject: " + doubleObject);
        System.out.println("doubleVariable: " + doubleVariable);
        
        doubleObject = 12d;
        System.out.println("doubleObject: " + doubleObject);
        
    }
    
    public void forLoopExample() {
        
       String []array = {"string1","string2","string3","string4"};
       System.out.println("\n\n");
       for(int counter=0;counter<array.length;counter++){
           System.out.println("array["+counter+"] = " + array[counter]);
       }
       
       System.out.println("\n\n");
       int counter = 0;
       for(String arrayObject: array) {
           System.out.println("array["+counter+"] = " + arrayObject);
       }
    }
    
    public static void main(String[] args) {
        Java5Features java5Features = new Java5Features();
        
        java5Features.autoboxingExample();
        java5Features.forLoopExample();
    }
}
