public class EmailTest {
    public static void main(String[] args) {
        Email Employe1 = new Email("Mihiretu", "Jackson", "shifutu@gmail.com", null, 
        "Finance", null);

        NewEmail( Employe1.GetFirstName(), Employe1.GetLastName(), Employe1.GetDepartment());

        
    

    }
    public static void NewEmail(String FirstName, String LastName, String Department ) {
        System.out.print(FirstName + "." + LastName + "@" + Department + ".company");
            
    }
}
