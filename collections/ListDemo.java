package collections;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
    int id;
    String name;
}

public class ListDemo{

    public static void main(String[] args){
        ArrayList<String> list1= new ArrayList<>();

        ArrayList<Object> list2= new ArrayList();

        Student s1=new Student();

        list1.add("Sim");
        list1.add("Simr");
        list1.add("Simran");
        //list1.add(10); //error

        list2.add(10);
        list2.add(2.2);
        list2.add("Simran");
        list2.add(s1);

        System.out.println("List1 is:"+list1);
        System.out.println("List2 is:"+list2);

        for(String element: list1){
            System.out.println(element.length());
        }

        list2.remove(2);
        System.out.println("List2 is:"+list2);

        Iterator<String> itr= list1.iterator();
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());

        // while(itr.hasNext()){
        //     String str=itr.next();
        //     System.out.println(str);
        // }
    }
}