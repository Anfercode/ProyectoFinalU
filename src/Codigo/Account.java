package Codigo;

class Account {

    int id;
    String Name;
    String Document;
    String Email;
    private String Password;

    public Account(String Name, String Document) {
        this.Name = Name;
        this.Document = Document;

    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getPassword() {
        return Password;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

    public String getDocument() {
        return Document;
    }

}
