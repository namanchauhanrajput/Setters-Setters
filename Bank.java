
class Account {
    public String name;
    protected String email;
    private String password;

    // getters & setters
    // this is getters
    public String getPssword() {
    return this.password;
    }
    // this is setters
    public void setPassword(String pass) {
        this.password = pass;
    }
}
public class Bank {
public static void main(String args[]) {
    Account account1= new Account();
    account1.name = "My Account";
    account1.email = "namanrajputnn001@gmail.com";
    account1.setPassword("abcd");
    System.out.println(account1.getPssword());
}
}