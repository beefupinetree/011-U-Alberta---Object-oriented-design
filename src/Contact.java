import java.util.Objects;
import java.util.UUID;

public class Contact {
    private String username;
    private String email;
    private String id;
    public Contact(String username, String email, String id) {
        this.username = username;
        this.email = email;

        if (id == null){
            this.setId();
        } else {
            this.updateId(id);
        }
    }

     public void setId(){
        this.id = UUID.randomUUID().toString();
    }
    public String getId(){
        return this.id;
    }
    public void updateId(String id){
        this.id = id;
    }
    public void setUsername(String myUsername){
        this.username = myUsername;
    }
    public String getUsername() {
        return this.username;
    }
    public void setEmail(String myEmail){
        this.email = myEmail;
    }
    public String getEmail() {
        return this.email;
    }
    /*@Override
    public boolean equals(Object o){
        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }
        // Check if o is an instance of Contact or not
        //  "null instanceof [type]" also returns false
        if (!(o instanceof Contact)) {
            return false;
        }
        // typecast o to Complex so that we can compare data members
        Contact c = (Contact) o;
        return this.id.equals(c.id);
    }*/
}
