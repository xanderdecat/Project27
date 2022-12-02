import java.time.LocalDate;
import java.util.ArrayList;

public class LocationProvider extends Provider {

    // instantievariabelen
    private static long helpLocPNumber = 0;
    private long locPNumber;
    // private ... image;
    private ArrayList<Location> locations;

    // constructor

    public LocationProvider(String firstName, String lastName, LocalDate dateOfBirth, ArrayList<String> emails, ArrayList<String> phoneNumber, String companyName, String VATnumber, String accountNumber, String streetName, int houseNumber, int ZIP, String city, String country, ArrayList<Location> locations) {
        super(firstName, lastName, dateOfBirth, emails, phoneNumber, companyName, VATnumber, accountNumber, streetName, houseNumber, ZIP, city, country);
        this.locPNumber = helpLocPNumber++;
        this.locations = locations;
    }
}
