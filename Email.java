public class Email {

    private String FirstName;
    private String LastName;
    private String Email;
    private String Password;
    private String Department;
    private String MailBoxCapacity;

    // get methods
    public String GetFirstName(){
        return FirstName;
    }

    // set methods
    public void setFirstName(String FirstName){
        this.FirstName = FirstName;
    }

    public String GetLastName(){
        return LastName;
    }
    public void setLastName(String LastName){
        this.LastName = LastName;
    }
    public String GetEmail(){
        return Email;
    }
    public void setEmail(String Email){
        this.Email = Email;
    }
    public String GetPassword(){
        return Password;
    }
    public void setPassword(String Password){
        this.Password = Password;
    }
    public String GetDepartment(){
        return Department;
    }
    public void setDepartment(String Department){
        this.Department = Department;
    }
    public String GetMailBoxCapacity(){
        return MailBoxCapacity;
    }
    public void setMailBoxCapacity(String MailBoxCapacity){
        this.MailBoxCapacity = MailBoxCapacity;
    }

    public Email(String FirstName, String LastName, String Email, String Password, String Department,String MailBoxCapacity){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Email = Email;
        this.Password = Password;
        this.Department = Department;
        this.MailBoxCapacity = MailBoxCapacity;
    }


    
}
