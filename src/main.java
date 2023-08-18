public class main {
    public static void main(String[] args) {
        contact.contacts.add(new contact("rose", "12345678"));
        contact.contacts.add(new contact("Tina", "12345678"));
        contact.contacts.add(new contact("Eve", "12345678"));
        contact.contacts.add(new contact("Shy", "12345678"));
        System.out.print("..Welcome to my contact manager...");
        System.out.print("..You have"+ contact.contacts.size()+ "contacts is your list") ;
    }
}
