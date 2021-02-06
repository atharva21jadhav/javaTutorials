package jadhav.atharva;

public class Contact {
    private String contactName;
    private String contactNumber;

    public Contact(String contactName, String contactNumber) {
        this.contactName = contactName;
        this.contactNumber = contactNumber;
    }

    public boolean updateContact(String newContactName, String newContactNumber){
        setContactName(newContactName);
        setContactNumber(newContactNumber);
        return true;
    }
    public boolean searchByName(String name){
        if(getContactName().equals(name)){
            return true;
        }
        return false;
    }
    public boolean searchContact(String number){
        if(getContactNumber().equals(number)){
            return true;
        }
        return false;
    }
    public void showContact(){
        System.out.println("Contact Name :" + contactName);
        System.out.println("Contact Number : "+ contactNumber);
    }

    private void setContactName(String contactName) {
        this.contactName = contactName;
    }

    private void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    private String getContactName() {
        return contactName;
    }

    private String getContactNumber() {
        return contactNumber;
    }
}
