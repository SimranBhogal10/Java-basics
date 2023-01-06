package LibraryManagementSystem.users;

import java.util.Scanner;

public class Admin {
    public String name;
    public int password;

    Scanner sc= new Scanner(System.in);

    public Admin(){

        System.out.println("Enter the username");
        this.name= sc.nextLine();

        System.out.println("Enter password");
        this.password= sc.nextInt();
    }
}
