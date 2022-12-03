import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;

public class ServiceProvider extends Provider {

    // enum van service types
    public enum serviceType {Cleaning, Bar};

    // instantievariabelen
    private static long helpSerPNumber = 0;
    private long serPNumber;
    // private ... image;
    private String serviceName;
    private serviceType typeOfService;
    private LocalDate activityDate;
    private int amountOfPeople;
    private long pricehour;
    private long minhours;
    private long maxhours;
    private String conditions;
    private String description;
    private URL linkToPage;

    // constructor
    public ServiceProvider(String firstName, String lastName, LocalDate dateOfBirth, ArrayList<String> emails, ArrayList<String> phoneNumber, String companyName, String VATnumber, String accountNumber, String streetName, int houseNumber, int ZIP, String city, String country) {
        super(firstName, lastName, dateOfBirth, emails, phoneNumber, companyName, VATnumber, accountNumber, streetName, houseNumber, ZIP, city, country);
    }
}
