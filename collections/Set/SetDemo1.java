package Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetDemo1 {
    public static void main(String[] args) {
 
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        set1.add("One");
        set1.add("Two");
        set1.add("Three");
        set1.add("Four");
        set1.add("Five");

        Iterator<String> i = set1.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        set1.remove("Three");
        System.out.println(set1.size());
    }
}
