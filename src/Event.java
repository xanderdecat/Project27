import java.net.URL;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Event {
    private enum stage {created, acceptedByAllProviders, transactionCompleted, last48hoursBeforeStart, ended}

    // instantievariabelen
    private long eventUserNumber;
    private ArrayList<Provider> eventProviderNumbers;
    private static long helpEventNumber = 0;
    private long eventNumber;
    private String eventName;
    private Location location;
    private String streetName;
    private int houseNumber;
    private int ZIP;
    private String city;
    private String country;
    private LocalDateTime startDate;
    private LocalDateTime confirmationDate;     // 2 dagen voor startDate
    private LocalDateTime endDate;
    private long eventDuration;
    private String description;
    private URL linkToPage;
    private ArrayList<Review> reviews;

    // constructor
    public Event(long eventUserNumber, ArrayList<Provider> eventProviderNumbers, long eventNumber, String eventName, Location location, String streetName, int houseNumber, int ZIP, String city, String country, LocalDateTime startDate, LocalDateTime endDate, String description, URL linkToPage, ArrayList<Review> reviews) {
        this.eventUserNumber = eventUserNumber;
        this.eventProviderNumbers = eventProviderNumbers;
        this.eventNumber = helpEventNumber + 1;
        this.eventName = eventName;
        this.location = location;
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.ZIP = ZIP;
        this.city = city;
        this.country = country;
        this.startDate = startDate;
        this.confirmationDate = startDate.minusDays(2);
        this.endDate = endDate;
        this.eventDuration = calculateDuration(startDate, endDate);
        this.description = description;
        this.linkToPage = linkToPage;
        this.reviews = reviews;
    }

    // constructor om een event aan te maken met minimale informatie
    public Event(long eventUserNumber, String eventName, String city, String country, LocalDateTime startDate, LocalDateTime endDate, String description, URL linkToPage) {
        this.eventUserNumber = eventUserNumber;
        this.eventNumber = helpEventNumber +1;
        this.eventName = eventName;
        this.city = city;
        this.country = country;
        this.startDate = startDate;
        this.confirmationDate = startDate.minusDays(2);
        this.endDate = endDate;
        this.eventDuration = calculateDuration(startDate, endDate);
        this.description = description;
        this.linkToPage = linkToPage;
    }

    // emptyEvent
    public Event(long eventUserNumber, String eventName, LocalDateTime startDate, LocalDateTime endDate, String description, URL linkToPage) {
        this.eventUserNumber = eventUserNumber;
        this.eventNumber = helpEventNumber++;
        this.eventName = eventName;
        this.confirmationDate = startDate.minusDays(2);
        this.startDate = startDate;
        this.endDate = endDate;
        this.eventDuration = calculateDuration(startDate, endDate);
        this.description = description;
        this.linkToPage = linkToPage;
        this.reviews = new ArrayList<>();
    }

    // methodes
    public long calculateDuration (LocalDateTime startDate, LocalDateTime endDate) {
        Duration tijd = Duration.between(startDate, endDate);
        if (tijd.toHours() > 24)
            return tijd.toDays();
        return tijd.toHours();
    }



}