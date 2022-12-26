package exceptions;

public class Example {
    public static void main(String[] args) {

        try {

          int divisionByZero = 5 / 0;
          System.out.println(divisionByZero);
        //   System.out.println("Rest of code in try block");
        }
        
        catch (ArithmeticException e) {
          System.out.println("ArithmeticException => " + e.getMessage());
        }
      }
}
