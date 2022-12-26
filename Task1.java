public class Task1 {
    public static void main(String[] args){
        String str="Hello World! I am Simran";
        String reverseString="";
        String[] arrOfStr= str.split(" ");
        
        System.out.println("Original String:");
        System.out.println(str);
        for(String ch: arrOfStr){
            // System.out.println(ch);
            reverseString= reverseString+reverseFunc(ch)+" ";
      
        }
        System.out.println("Reversed String:");
        System.out.println(reverseString);
    }
    public static String reverseFunc(String word){
        char ch;
        String rev="";
        for(int i=0; i<word.length(); i++){
            ch=word.charAt(i);
            rev=ch+rev;
        }
        // System.out.println(rev);
        return rev;
    }
}

