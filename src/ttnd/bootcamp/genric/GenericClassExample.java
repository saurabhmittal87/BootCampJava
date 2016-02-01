package ttnd.bootcamp.genric;

/**
 *
 * @author saurabh
 */
public class GenericClassExample<T> {

  private T t;

  public void add(T t) {
    this.t = t;
  }

  public T get() {
    return t;
  }

  public static void main(String[] args) {
     GenericClassExample<Integer> integerGenericClassExample = new GenericClassExample<Integer>();
     GenericClassExample<String> stringGenericClassExample = new GenericClassExample<String>();
    
     integerGenericClassExample.add(new Integer(10));
     stringGenericClassExample.add(new String("Hello World"));

     System.out.printf("Integer Value :%d\n\n", integerGenericClassExample.get());
     System.out.printf("String Value :%s\n", stringGenericClassExample.get());
  }
}
