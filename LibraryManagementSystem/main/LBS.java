package LibraryManagementSystem.main;

import java.util.Scanner;

import LibraryManagementSystem.users.Users;
import LibraryManagementSystem.books.Books;
import LibraryManagementSystem.users.Admin;
import LibraryManagementSystem.users.User;

public class LBS {

    public static void main(String args[]) {

        Scanner scObj = new Scanner(System.in);

        boolean continueLoop = true;
        boolean continueLoop2 = true;
        boolean continueLoop3 = true;

        System.out.println("=======================Welcome to library management system!======================");
        System.out.println("**************Enter your choice!**************");

        while (continueLoop) {

            System.out.println("Press 1 to register user!");
            System.out.println("Press 2 for admin login");
            System.out.println("Press 3 to exit the application!");
            int choice = scObj.nextInt();

            Users userObj = new Users();
            Books bookObj = new Books();

            if (choice == 1) {
                User singleUser = new User();
                try {
                    userObj.addUser(singleUser);
                    System.out.println("You need to login first!");
                    if (userObj.userLogin(singleUser)) {
                        bookObj.addBooks();
                        System.out.println("=====================Welcome to User dashboard!=====================");

                        while (continueLoop2) {
                            System.out.println("Press 1 to view all books!");
                            System.out.println("Press 2 to issue book!");
                            System.out.println("Press 3 to view your details");
                            System.out.println("Press 4 to logout!");

                            int userChoice = scObj.nextInt();

                            if (userChoice == 1) {
                                bookObj.displayBooks();
                                System.out.println("*******************************************************");
                            } else if (userChoice == 2) {
                                bookObj.issueBook();
                                System.out.println("*******************************************************");
                            } else if (userChoice == 3) {
                                userObj.displayUser(singleUser);
                                System.out.println("*******************************************************");
                            } else if (userChoice == 4) {
                                continueLoop2 = false;
                                System.out.println("Logged Out!");
                                System.out.println("*******************************************************");
                            } else {
                                System.out.println("Invalid Input");
                                System.out.println("*******************************************************");
                            }
                        }
                    }
                    else{
                        System.out.println("Invalid credentials!");
                        System.out.println("*******************************************************");
                    }
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            } else if (choice == 2) {
                Admin admin = new Admin();
                try {
                    userObj.adminLogin(admin);
                    System.out.println("===========Welcome to admin dashboard!=============");
                    while (continueLoop3) {
                        System.out.println("Press 1 to add books!");
                        System.out.println("Press 2 to view all books!");
                        System.out.println("Press 3 to logout!");

                        int adminChoice = scObj.nextInt();

                        if (adminChoice == 1) {
                            // add books which will be done in db!
                            bookObj.addBooks();
                            System.out.println("Books added successfully!");
                            System.out.println("*******************************************************");
                        } else if (adminChoice == 2) {
                            bookObj.displayBooks();
                            System.out.println("*******************************************************");
                        } else if (adminChoice == 3) {
                            continueLoop3 = false;
                            System.out.println("Logout successfull!");
                            System.out.println("*******************************************************");
                        } else {
                            System.out.println("Invalid Input");
                            System.out.println("*******************************************************");
                        }
                    }
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            } else {
                System.out.println("Thank you! Visit Again.");
                System.out.println("*******************************************************");
                continueLoop = false;
            }
        }

    }

}
