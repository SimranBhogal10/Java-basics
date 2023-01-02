package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Simran");
        set.add("Simr");

        Iterator<String> itr = set.iterator();

        while (itr.hasNext()) {
            String str = itr.next();
            System.out.println(str);
        }

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

        TreeSet<String> al = new TreeSet<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        // Traversing elements
        Iterator<String> it = al.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
