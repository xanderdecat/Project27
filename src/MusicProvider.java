import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;

public class MusicProvider extends Provider {

    // enum van genres
    public enum genre {Techno, Rock, Pop, Dance, Blues, Jazz, Soul, Party, Hiphop, Acoustic, Disco, Funk, Classic, Background, Nineties, Eighties, Seventies, Sixties, Latin, Lounge};

    // instantievariabelen
    private static long helpMusPNumber = 0;
    private long musPNumber;
    // private ... image;
    private String artistName;
    private ArrayList<genre> genres;
    private LocalDate activityDate;
    private long priceHour;
    private long minHours;
    private long maxHours;
    private URL teaserSet;
    private String conditions;
    private String description;
    private URL linkToPage;

    // constructor
    public MusicProvider(String firstName, String lastName, LocalDate dateOfBirth, ArrayList<String> emails, ArrayList<String> phoneNumber, String companyName, String VATnumber, String accountNumber, String streetName, int houseNumber, int ZIP, String city, String country, String artistName, ArrayList<genre> genres, LocalDate activityDate, long priceHour, long minHours, long maxHours, URL teaserSet, String conditions, String description, URL linkToPage) {
        super(firstName, lastName, dateOfBirth, emails, phoneNumber, companyName, VATnumber, accountNumber, streetName, houseNumber, ZIP, city, country);
        this.musPNumber = helpMusPNumber++;
        this.artistName = artistName;
        this.genres = genres;
        this.activityDate = activityDate;
        this.priceHour = priceHour;
        this.minHours = minHours;
        this.maxHours = maxHours;
        this.teaserSet = teaserSet;
        this.conditions = conditions;
        this.description = description;
        this.linkToPage = linkToPage;
    }
}
