package LibraryManagementSystem.users;

import java.util.Scanner;

public class User {

    public String name;
    public String emailId;
    public String passWord;
    public String address;

    Scanner scanner=new Scanner(System.in);

    public User(){

        System.out.println("Enter your name");
        this.name= scanner.nextLine();

        System.out.println("Enter your email ID:");
        this.emailId= scanner.nextLine();

        System.out.println("Enter your address:");
        this.address= scanner.nextLine();

        System.out.println("Enter your password!");
        this.passWord = scanner.nextLine();
    }
    public String getUserName(){
        return this.name;
    }
    public String getEmail(){
        return this.emailId;
    }
    public String getAddress(){
        return this.address;
    }
    public String getPassWord() {
        return this.passWord;
    }

}
