import java.net.URL;

public class Location {

    // instantievariabelen
    private long locPNumber;
    private static long helpLocationNumber = 0;
    private long locationNumber;
    // private ... image;
    private String loactionName;
    private String streetName;
    private int houseNumber;
    private int ZIP;
    private String city;
    private String country;
    private long surface;
    private int maxCapacity;
    private boolean indoor;
    private boolean outdoor;
    private int parkingPlaces;
    private long priceHour;
    private long minHours;
    private long maxHours;
    private String description;
    private URL linkToPage;

    // constructor

    public Location(long locPNumber, String loactionName, String streetName, int houseNumber, int ZIP, String city, String country, long surface, int maxCapacity, boolean indoor, boolean outdoor, int parkingPlaces, long priceHour, long minHours, long maxHours, String description, URL linkToPage) {
        this.locPNumber = locPNumber;
        this.locationNumber = helpLocationNumber++;
        this.loactionName = loactionName;
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.ZIP = ZIP;
        this.city = city;
        this.country = country;
        this.surface = surface;
        this.maxCapacity = maxCapacity;
        this.indoor = indoor;
        this.outdoor = outdoor;
        this.parkingPlaces = parkingPlaces;
        this.priceHour = priceHour;
        this.minHours = minHours;
        this.maxHours = maxHours;
        this.description = description;
        this.linkToPage = linkToPage;
    }
}
