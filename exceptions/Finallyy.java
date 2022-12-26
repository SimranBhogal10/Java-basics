package exceptions;

public class Finallyy {
    public static void main(String[] args) {
        try {
          int divideByZero = 5 / 0;
          System.out.println(divideByZero);
        }
    
        catch (ArithmeticException e) {
          System.out.println("ArithmeticException => " + e.getMessage());
        }
        
        finally {
          System.out.println("This is the finally block");
        }
      }    
}
