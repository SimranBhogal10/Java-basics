package strings;

public class StringDemo {
    public static void main(String[] args) {

        // concatenation
        String first = "Java ";
        String second = "Programming";

        String joinedString = first.concat(second);
        System.out.println("Joined String: " + joinedString);

        // compare
        String str = "java programming";
        String str1 = "java programming";
        String str2 = "python programming";

        boolean result1 = str.equals(str1);
        System.out.println("Strings first and second are equal: " + result1);

        boolean result2 = str.equals(str2);
        System.out.println("Strings first and third are equal: " + result2);

        //startswith
        String s1="java string split method by javatpoint";    
        System.out.println(s1.startsWith("ja"));   
        System.out.println(s1.startsWith("java string"));    
        System.out.println(s1.startsWith("Java string")); 
        
        
    }
}
