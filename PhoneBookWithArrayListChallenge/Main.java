package jadhav.atharva;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
	// write your code here
        boolean exitFlag = false;
        while(!exitFlag){
            printInstructions();
            System.out.println("-----------------------------");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    exitFlag = true;
                    break;
                case 1:
                    viewContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    findContact();
                    break;
                case 9:
                    printInstructions();
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
        scanner.close();
    }

    public static void printInstructions(){
        System.out.println("---------Choose an option---------");
        System.out.println("    0. Exit");
        System.out.println("    1. Show contact list.");
        System.out.println("    2. Add a contact.");
        System.out.println("    3. Update a contact.");
        System.out.println("    4. Remove a contact.");
        System.out.println("    5. Search a contact.");
        System.out.println("    9. Show options.");
    }

    private static void viewContacts(){
        mobilePhone.showContacts();
        System.out.println("--------------------------------");
    }

    private static void addContact(){
        System.out.println("Enter name of person:");
        String contactName = scanner.nextLine();
        System.out.println("Enter contact number of person");
        String contactNumber = scanner.nextLine();
        mobilePhone.addContact(contactName, contactNumber);
        System.out.println("--------------------------------");
    }

    private static void updateContact(){
        System.out.println("Enter name of person:");
        String oldName = scanner.nextLine();
        System.out.println("Enter new name of person:");
        String newContactName = scanner.nextLine();
        System.out.println("Enter new number of person:");
        String newContactNumber = scanner.nextLine();
        mobilePhone.updateContact(oldName, newContactName, newContactNumber);
        System.out.println("--------------------------------");
    }

    private static void removeContact(){
        System.out.println("Enter name of person:");
        String contactName = scanner.nextLine();
        mobilePhone.removeContact(contactName);
        System.out.println("--------------------------------");
    }

    private static void findContact(){
        System.out.println("Enter number of person:");
        String contactNumber = scanner.nextLine();
        mobilePhone.findContact(contactNumber);
        System.out.println("--------------------------------");
    }

}
