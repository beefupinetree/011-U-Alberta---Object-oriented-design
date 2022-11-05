import java.util.ArrayList;

public class ContactList {
    private ArrayList<Contact> contacts;
    private String FILENAME;

    public ContactList() {
        contacts = new ArrayList<Contact>();
    }
    public void setContacts(ArrayList<Contact> contact_list) {
        this.contacts = contact_list;
    }
    public ArrayList<Contact> getContacts() {
        return this.contacts;
    }
    public ArrayList<String> getAllUsernames() {
        ArrayList<String> myList = new ArrayList<>();
        for (int i=0; i<this.contacts.size(); i++) {
            myList.add(this.contacts.get(i).getUsername());
        }
        return myList;
    }
    public void addContact(Contact contact) {
        this.contacts.add(contact);
    }
    public void deleteContact(Contact contact) {
        this.contacts.remove(contact);
    }
    public Contact getContact(int index) {
        return this.contacts.get(index);
    }
    public int getSize(){
        return this.contacts.size();
    }
    public int getIndex(Contact contact) {
        int ret = 0;
        for (int i=0; i<this.contacts.size(); i++) {
             if (this.contacts.get(i).equals(contact)) {
                ret = i;
                break;
            }
        }
        return  ret;
    }
    public boolean hasContact(Contact contact) {
        boolean flag = false;
        for (int i=0; i<this.contacts.size(); i++) {
            if (this.contacts.get(i).equals(contact)) {
                flag = true;
                break;
            }
        }
        return  flag;
    }
    public Contact getContactByUsername(String username) {
        Contact ret = new Contact("x","x","999");
        for (int i=0; i<this.contacts.size(); i++) {
            if (this.contacts.get(i).getUsername().equals(username)) {
                return this.contacts.get(i);
            }
        }
        return  null;
    }
    public boolean isUsernameAvailable(String username) {
        return this.getAllUsernames().contains(username);
    }
}
