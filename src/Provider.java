import java.time.LocalDate;
import java.util.ArrayList;

public class Provider extends User {

    // instantievariabelen
    private static long helpProviderNumber = 0;
    private long providerNumber;            // unique key
    private String companyName;
    private String VATnumber;
    private String accountNumber;
    private String streetName;
    private int houseNumber;
    private int ZIP;
    private String city;
    private String country;
    // private ArrayList<>;

    // constructor
    public Provider(String firstName, String lastName, LocalDate dateOfBirth, ArrayList<String> emails, ArrayList<String> phoneNumber, String companyName, String VATnumber, String accountNumber, String streetName, int houseNumber, int ZIP, String city, String country) {
        super(firstName, lastName, dateOfBirth, emails, phoneNumber);       // verwijzen naar user klasse
        this.providerNumber = helpProviderNumber++;
        this.companyName = companyName;
        this.VATnumber = VATnumber;
        this.accountNumber = accountNumber;
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.ZIP = ZIP;
        this.city = city;
        this.country = country;
    }
}
