package Codigo;

/**
 * Driver
 */
public class User extends Account {

    public User(String Name, String Document, String Password, String Email) {
        super(Name, Document);
        this.Password = Password;
        this.Email = Email;

    }

}
