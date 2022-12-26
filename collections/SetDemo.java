package collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {
    public static void main(String[] args){
        HashSet<String> set=new HashSet<>();
        set.add("Simran");
        set.add("Simr");

        Iterator<String> itr= set.iterator();

        while(itr.hasNext()){
            String str=itr.next();
            System.out.println(str);
        }
    }
}
