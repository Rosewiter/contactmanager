import java.util.ArrayList;
import java.util.List;

public class  contact {
    public static List<contact> contacts = new ArrayList<contact>();

    public static contact getcontact(String searchString){

        boolean isFound = contacts.contains(searchString);
    }


    private String email;
    private String phone;

    public contact(String email, String phone) {
        this.email = email;
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}