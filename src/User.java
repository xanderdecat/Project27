import java.time.LocalDate;
import java.util.ArrayList;

public class User {

    // instantievariabelen
    private static long helpUserNumber = 0;
    private long userNumber;                    // unique key
    private String firstName;
    private String lastName;
    private String name;
    private LocalDate dateOfBirth;
    private int age;                            // derived from dateOfBirth
    private ArrayList<String> emails;           // multiple emails
    private ArrayList<String> phoneNumbers;     // multiple phoneNumbers
    private ArrayList<Event> history;
    private ArrayList<Review> reviews;

    // constructor
    public User(String firstName, String lastName, LocalDate dateOfBirth, ArrayList<String> emails, ArrayList<String> phoneNumbers) {
        this.userNumber = helpUserNumber++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.name = firstName + " " + lastName;
        this.dateOfBirth = dateOfBirth;
        this.age = dateOfBirth.compareTo(LocalDate.now());      // correct?
        this.emails = emails;
        this.phoneNumbers = phoneNumbers;
        this.history = new ArrayList<>();
        this.reviews = new ArrayList<>();
    }
}
