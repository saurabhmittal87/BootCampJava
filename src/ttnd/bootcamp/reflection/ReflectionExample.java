package ttnd.bootcamp.reflection;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author saurabh
 */
class ParentClass {
    
}

public class ReflectionExample {

    public static void main(String args[]) {
        try {
            
            Class c = Class.forName("ttnd.bootcamp.reflection.ParentClass");
            System.out.println(c.getName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReflectionExample.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
