import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Contact> varContact = new ArrayList<>();
        System.out.println("Yo world!");
        Contact myClass = new Contact("booboo", "boo@boomail.com", "007");
        System.out.println(myClass.getUsername());
        varContact.add(myClass);
        ContactList myList = new ContactList();
        myList.setContacts(varContact);
        System.out.println(myList.getAllUsernames());
        /*myList.deleteContact(myClass);
        System.out.println(myList.getAllUsernames());*/
        System.out.println(myList.getIndex(myClass));
        System.out.println(myList.getContactByUsername("booboo"));
        System.out.println(myList.isUsernameAvailable("booboo"));
    }
}