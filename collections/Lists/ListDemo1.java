package Lists;

import java.util.Iterator;
import java.util.LinkedList;

class Student{
    int id;
    String name;
}

public class ListDemo1{

    public static void main(String[] args){

        LinkedList<Integer> list3= new LinkedList<>();


        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);
        list3.add(5);
        list3.add(6);

        System.out.println("List3 is:"+list3);



        Iterator<Integer> itr= list3.iterator();
        // System.out.println(itr.next());
        // System.out.println(itr.next());
        // System.out.println(itr.next());

        while(itr.hasNext()){
            Integer num=itr.next();
            System.out.println(num);
        }
    }
}