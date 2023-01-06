package LibraryManagementSystem.users;

import java.util.HashMap;
import java.util.Scanner;

public class Users {
    
    Scanner scanner=new Scanner(System.in);
    HashMap<Integer, Object> userList = new HashMap<Integer, Object>();
    int id = 1;

    public void addUser(User singleUser) throws Exception {
        if(singleUser.name==""|| singleUser.emailId=="" || singleUser.address=="" || singleUser.passWord==""){
            throw new Exception("Invalid credentials!");
        }
        else{
            userList.put(id, singleUser);
            System.out.println("You are registered!");
            id+=1;
        }
    }


    public void adminLogin(Admin admin) throws Exception{
        if(admin.name!="admin" && admin.password!=123){
            throw new Exception("Invalid credentials!");
        }
        else{
            System.out.println("Login as admin successful!");
        }
    }

    public boolean userLogin(User singleUser){
        System.out.println("Enter your email");
        String email=scanner.nextLine();
        System.out.println("Enter the password");
        String passWord= scanner.nextLine();
        if(singleUser.getEmail().equals(email) && singleUser.getPassWord().equals(passWord)){
            return true;
        }
        else{
            return false;
        }
    }


    public void displayUser(User singleUser) {
        userList.entrySet().forEach(entry -> {
            System.out.println("Id \t\t\t\t Name \t\t\t\t  Address \t\t\t\t  Email \t\t\t\t");
            System.out.println(entry.getKey()+ "\t\t\t\t" + singleUser.getUserName() + "\t\t\t\t" + singleUser.getAddress() + "\t\t\t\t" + singleUser.getEmail());
        }
        );
    }

}
