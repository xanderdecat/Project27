import java.net.URL;
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
    private LocalDateTime confirmationDate;
    private LocalDateTime endDate;
    private LocalDateTime eventDuration;
    private String description;
    private URL linkToPage;
    private ArrayList<Review> reviews;

    // constructor


    public Event(long eventUserNumber, ArrayList<Provider> eventProviderNumbers, long eventNumber, String eventName, Location location, String streetName, int houseNumber, int ZIP, String city, String country, LocalDateTime startDate, LocalDateTime confirmationDate, LocalDateTime endDate, LocalDateTime eventDuration, String description, URL linkToPage, ArrayList<Review> reviews) {
        this.eventUserNumber = eventUserNumber;
        this.eventProviderNumbers = eventProviderNumbers;
        this.eventNumber = eventNumber;
        this.eventName = eventName;
        this.location = location;
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.ZIP = ZIP;
        this.city = city;
        this.country = country;
        this.startDate = startDate;
        this.confirmationDate = confirmationDate;
        this.endDate = endDate;
        this.eventDuration = eventDuration;
        this.description = description;
        this.linkToPage = linkToPage;
        this.reviews = reviews;
    }
}