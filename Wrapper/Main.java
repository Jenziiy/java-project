package Wrapper;

//import static java.lang.System.out;

public class Main {
  public static void main(String[] args) {
    int num = 7;
    Integer num3 = new Integer(num); // boxing > converts to object explicitly 'under the bonnet'
    Integer num1 = num; // autoboxing -> store a primitive type in the object automatically
    int num2 = num1.intValue(); // unboxing -> take out the primitive value from the obj manually
    int num2 = num1; // auto-unboxing -> take out the primitive value from the obj

    System.out.println(num1);

    String str = "200"; // -> get a string
    int num4 = Integer.parseInt(str); // -> use the parse int meth of the obj Integer and pass the string;
    System.out.println(num4 * 2); // Integer is a wrapper class

  }

}
