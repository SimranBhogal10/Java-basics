package LibraryManagementSystem.books;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Books {

    List<Book> bookList = new ArrayList<>();
    Scanner scanner= new Scanner(System.in);

    public void addBooks(){
        
        bookList.add(new Book(1,"Alice in the wonderland",12));
        bookList.add(new Book(2,"The fault in our stars",20));
        bookList.add(new Book(3,"The secret",10));
        bookList.add(new Book(4,"Ponniyin Selvan",12));
        bookList.add(new Book(5,"A time to kill",12));
        bookList.add(new Book(6,"The last testament",10));
        bookList.add(new Book(7,"Pink or Black",2));
        bookList.add(new Book(8,"Two states",1));
        bookList.add(new Book(9,"Revolution 2020",22));
        bookList.add(new Book(10,"Wings of Fire",10));
        
    }

    public void displayBooks(){

        System.out.println("Id \t  Available Books \t\t  Name");
        for(Book book: bookList){
            System.out.println(book.getBookId()+ "\t\t"+ book.getBookCount() + "\t\t\t" + book.getBookName());
        }
    }

    public void issueBook(){

        System.out.println("Enter book name:");
        String name=scanner.nextLine();
        if(checkAvailabilityAndUpdate(name)){
            System.out.println("Book issued!");
        }
        else{
            System.out.println("Book not available!");
        }
    }

    public boolean checkAvailabilityAndUpdate(String name){
        int flag=0;
        for(Book book: bookList){
            if(book.getBookName().equalsIgnoreCase(name)){
                if(book.getBookCount()>0){
                    book.availableCount=book.getBookCount()-1;
                    flag+=1;
                }
                break;
            }
        }
        if(flag==1){
            return true;
        }
        else{
            return false;
        }
    }
}
