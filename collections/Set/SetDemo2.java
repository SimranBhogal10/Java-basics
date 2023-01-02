package Set;

import java.util.Iterator;
import java.util.TreeSet;


public class SetDemo2 {
    public static void main(String args[]){
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
