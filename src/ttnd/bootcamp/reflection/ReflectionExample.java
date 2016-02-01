package ttnd.bootcamp.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author saurabh
 */
class ParentClass {

    public Integer parentIntegerVariable = 10;
    private String parentStringVariable = "reflection";

    public Integer getIntegerVariable() {
        return parentIntegerVariable;
    }

    public void setIntegerVariable(Integer integerVariable) {
        this.parentIntegerVariable = integerVariable;
    }

    public String getVariable() {
        return parentStringVariable;
    }

    public void setVariable(String stringVariable) {
        this.parentStringVariable = stringVariable;
    }
    
    private Integer getDoubleIntegerValue(){
        return parentIntegerVariable *2;
    }
    
    private String getReverseStringValue() {
        return parentStringVariable;
    }
}


class ChildClass extends ParentClass {
    
    public Integer childIntegerVariable = 20;
    private String childStringVariable = "Child";

    public Integer getChildIntegerVariable() {
        return childIntegerVariable;
    }

    public void setChildIntegerVariable(Integer childIntegerVariable) {
        this.childIntegerVariable = childIntegerVariable;
    }

    public String getChileStringVariable() {
        return childStringVariable;
    }

    public void setChileStringVariable(String chileStringVariable) {
        this.childStringVariable = chileStringVariable;
    }
    
    private void samplePrivateMethod(){
        System.out.println("Sample Private Method Called");
    }
}

public class ReflectionExample {

    
    public void forNameExample() {
        try {
            
            Class c = Class.forName("ttnd.bootcamp.reflection.ParentClass");
            System.out.println(c.getName());
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException occured");
        }
    }
    
    public void reflection() throws Exception{
        
        ParentClass parentClassObject = new ParentClass();
        ChildClass childClassObject = new ChildClass();
        
        Class parentClass = ParentClass.class;
       
        System.out.println("Parent Class Cannonical name: " + parentClass.getCanonicalName());
        System.out.println("Parent Class Simple name: " + parentClass.getSimpleName());
        
        Field [] parentClassFields = parentClass.getDeclaredFields();
        for(Field parentClassField : parentClassFields) {
            System.out.println("\n\nField Name: " + parentClassField.getName());
            System.out.println("Field Type: " + parentClassField.getType());
            System.out.println("Field's Generic String: " + parentClassField.toGenericString());
            System.out.println("Field Accessible: " + parentClassField.isAccessible()); 
        }
        
        Class childClass = ChildClass.class;
       
        System.out.println("\n\nChild Class Cannonical name: " + childClass.getCanonicalName());
        System.out.println("Child Class Simple name: " + childClass.getSimpleName());
        
        System.out.println("\nDeclared Fields");
        Field [] childClassFields = childClass.getDeclaredFields();
        for(Field childClassField : childClassFields) {
            System.out.println("\nField Name: " + childClassField.getName());
            System.out.println("Field Type: " + childClassField.getType());
            System.out.println("Field's Generic String: " + childClassField.toGenericString());
            System.out.println("Field Accessible: " + childClassField.isAccessible()); 
        }
        
        System.out.println("\nFields");
        childClassFields = childClass.getFields();
        for(Field childClassField : childClassFields) {
            System.out.println("\nField Name: " + childClassField.getName());
            System.out.println("Field Type: " + childClassField.getType());
            System.out.println("Field's Generic String: " + childClassField.toGenericString());
            System.out.println("Field Accessible: " + childClassField.isAccessible()); 
        }
        
        System.out.println("\nDeclared Methods");
        Method [] childClassDeclaredMethods = childClass.getDeclaredMethods();
        for(Method childClassDeclaredMethod : childClassDeclaredMethods) {
            System.out.println("\nMethod Name: " + childClassDeclaredMethod.getName());
            System.out.println("Method's Generic String: " + childClassDeclaredMethod.toGenericString());
            System.out.println("Method Accessibility: " + childClassDeclaredMethod.isAccessible()); 
        }
        
        System.out.println("\nMethods");
        Method [] childClassMethods = childClass.getDeclaredMethods();
        for(Method childClassMethod : childClassMethods) {
            System.out.println("\nMethod Name: " + childClassMethod.getName());
            System.out.println("Method's Generic String: " + childClassMethod.toGenericString());
            System.out.println("Method Accessibility: " + childClassMethod.isAccessible());
            System.out.println("Method Accessibility: " + childClassMethod.getModifiers());
        }
    }
    
    public static void main(String[] args) throws Exception {
        ReflectionExample reflectionExample = new ReflectionExample();
        
        reflectionExample.reflection();
    }
}
