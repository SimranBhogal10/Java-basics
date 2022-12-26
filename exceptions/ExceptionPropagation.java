package exceptions;

public class ExceptionPropagation{  
void method1(){  
    int data=50/0;  
  }  
  void method2(){  
    method1();  
  }  
  void method3(){  
  //  try{  
    method2();  
  //  }catch(Exception e){System.out.println("exception handled");}  
  }  
  public static void main(String args[]){  
   ExceptionPropagation obj=new ExceptionPropagation();  
   obj.method3();  
   System.out.println("normal flow...");  
  }   
    
}
