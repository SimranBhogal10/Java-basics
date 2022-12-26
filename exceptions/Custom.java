package exceptions;

public class Custom {

    static void validate (int age) throws CustomException{    
       if(age < 18){   
        throw new CustomException("Not eligible to vote!");    
    }  
       else {   
        System.out.println("You are eligible to vote!");   
        }   
     }    
  
    public static void main(String args[])  
    {  
        try  
        {  
            validate(20);  
        }  
        catch (CustomException err)  
        {  
            System.out.println("Caught the exception");  
     
            System.out.println("Exception occured: " + err);  
        }  
  
        System.out.println("rest of the code...");    
    }  
}
