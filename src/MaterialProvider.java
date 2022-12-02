import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;

public class MaterialProvider extends Provider {

    // instantievariabelen
    private static long helpMatPNumber = 0;
    private long matPNumber;
    // private ... image;
    private LocalDate activityDate;
    private URL linkToPage;
    private ArrayList<Material> materials;

    // constructor
    public MaterialProvider(String firstName, String lastName, LocalDate dateOfBirth, ArrayList<String> emails, ArrayList<String> phoneNumber, String companyName, String VATnumber, String accountNumber, String streetName, int houseNumber, int ZIP, String city, String country, LocalDate activityDate, URL linkToPage, ArrayList<Material> materials) {   // in de constructor materials list?
        super(firstName, lastName, dateOfBirth, emails, phoneNumber, companyName, VATnumber, accountNumber, streetName, houseNumber, ZIP, city, country);
        this.matPNumber = helpMatPNumber++;
        this.activityDate = activityDate;
        this.linkToPage = linkToPage;
        this.materials = materials;
    }

}
