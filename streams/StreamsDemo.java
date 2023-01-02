package streams;

import java.util.Arrays;
import java.util.List;

public class StreamsDemo {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk"); 
        long count = strList.stream() 
                            .filter(x -> x.isEmpty()) 
                            .count(); 
        System.out.printf("List %s has %d empty strings %n", strList, count);   
        
        // Count String with length more than 3 
        long num = strList.stream() 
                          .filter(x -> x.length()> 3) 
                          .count(); 
        System.out.printf("List %s has %d strings of length more than 3 %n", strList, num);  

        // Count number of String which startswith "a" 
        count = strList.stream() 
                       .filter(x -> x.startsWith("a")) 
                       .count(); 
        System.out.printf("List %s has %d strings which startsWith 'a' %n", strList, count);   
        
        
    }
}
