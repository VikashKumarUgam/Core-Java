import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact newContact){
        int isfound = findContact(newContact.getName());
        if(isfound >=0){
            return false;
        }
        myContacts.add(newContact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        if(findContact(oldContact) < 0){
            return false;
        }
        else if(findContact(newContact.getName()) >= 0){
            return false;
        }

        myContacts.set(findContact(oldContact), newContact);
        return true;
    }

    public boolean removeContact(Contact contact){
        int isfound = findContact(contact);
        if(isfound >=0){
            myContacts.remove(isfound);
            return true;
        }
        return false;
    }

    private int findContact(Contact contact){
        return myContacts.indexOf(contact);
    }

    private int findContact(String name){
        for (int i = 0; i<myContacts.size();i++){
            if(myContacts.get(i).getName().equals(name))
                return i;
        }
        return -1;
    }

    public Contact queryContact(String name){
        int isfound = findContact(name);
        if(isfound >= 0)
            return myContacts.get(isfound);
        return null;
    }

    public void printContacts(){
        System.out.println("Contact List:");
        for(int i =0 ; i<myContacts.size();i++)
            System.out.println(i+1 + ". "+myContacts.get(i).getName()+" -> "+myContacts.get(i).getPhoneNumber());
    }
}
