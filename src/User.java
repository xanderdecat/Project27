import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
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
    private ArrayList<Event> actualEvents;
    private ArrayList<Event> history;
    private ArrayList<Review> reviews;

    // constructor
    public User(String firstName, String lastName, LocalDate dateOfBirth, ArrayList<String> emails, ArrayList<String> phoneNumbers) {
        this.userNumber = helpUserNumber++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.name = firstName + " " + lastName;
        this.dateOfBirth = dateOfBirth;
        this.age = Period.between(dateOfBirth, LocalDate.now()).getYears();      // correct
        this.emails = emails;
        this.phoneNumbers = phoneNumbers;
        this.actualEvents = new ArrayList<>();
        this.history = new ArrayList<>();
        this.reviews = new ArrayList<>();
    }

    // methodes
    public Event createEmptyEvent (String eventName, LocalDateTime startDate, LocalDateTime endDate, String description, URL linkToPage) {
        Event newEvent = new Event(getUserNumber(), eventName, startDate, endDate, description, linkToPage);
        actualEvents.add(newEvent);
        return newEvent;
    }










    // getters en setters
    public static long getHelpUserNumber() {
        return helpUserNumber;
    }

    public static void setHelpUserNumber(long helpUserNumber) {
        User.helpUserNumber = helpUserNumber;
    }

    public long getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(long userNumber) {
        this.userNumber = userNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<String> getEmails() {
        return emails;
    }

    public void setEmails(ArrayList<String> emails) {
        this.emails = emails;
    }

    public ArrayList<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(ArrayList<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public ArrayList<Event> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Event> history) {
        this.history = history;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

}
