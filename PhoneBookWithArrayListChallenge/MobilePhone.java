package jadhav.atharva;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contacts = new ArrayList<Contact>();

    public void addContact(String contactName, String contactNumber){
        if(contacts.isEmpty()){
            Contact newContact = new Contact(contactName, contactNumber);
            if(contacts.add(newContact)){
                System.out.println("Number saved successfully.");
            }
            else{
                System.out.println("Error occurred while saving the number");
            }
        }
        else{
            boolean flag = false;
            for(Contact i : contacts){
                if(i.searchContact(contactNumber)){
                    System.out.println("Number already exists");
                    flag = true;
                    break;
                }
            }
            if(!flag){
                Contact newContact = new Contact(contactName, contactNumber);
                if(contacts.add(newContact)){
                    System.out.println("Number saved successfully.");
                }
                else{
                    System.out.println("Error occurred while saving the number");
                }
            }
        }
    }

    public void showContacts(){
        if(contacts.isEmpty()){
            System.out.println("Contact list is empty.");
            return;
        }
        for(Contact i : contacts){
            i.showContact();
        }
    }

    public void findContact(String contactNumber){
        boolean flag = false;
        Contact detail = new Contact("","");
        for(Contact i : contacts){
            if(i.searchContact(contactNumber)){
                flag = true;
                detail = i;
                break;
            }
        }
        if(flag){
            detail.showContact();
        }
        else{
            System.out.println("No contact found.");
        }
    }

    public void updateContact(String contactName, String newContactName, String newContactNumber){
        Contact tempContact = new Contact("","");
        boolean flag = false;
        for(Contact currentContact : contacts){
            if(currentContact.searchByName(contactName)){
                flag = true;
                tempContact = currentContact;
                break;
            }
        }
        if(flag){
            if(tempContact.updateContact(newContactName, newContactNumber)){
                System.out.println("Contact updated successfully");
            }
            else{
                System.out.println("Contact could not be updated");
            }
        }
        else{
            System.out.println("No contact found for contact name "+ contactName);
        }
    }

    public void removeContact(String contactName){
        Contact tempContact = new Contact("","");
        boolean flag = false;
        for(Contact currentContact : contacts){
            if(currentContact.searchByName(contactName)){
                flag = true;
                tempContact = currentContact;
                break;
            }
        }
        if(contacts.remove(tempContact)){
            System.out.println("Contact removed successfully");
        }
        else {
            System.out.println("Contact can't be removed.");
        }
    }
}
