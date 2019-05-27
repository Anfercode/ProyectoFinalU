package Codigo;

/**
 * Driver
 */
public class Driver extends Account{

    public Driver(String Name, String Document, String Password, String Email) {
        super(Name, Document);
        this.setPassword(Password);
        this.Email = Email;
    }
}