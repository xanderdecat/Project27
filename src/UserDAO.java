import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UserDAO { //klasse om te interageren met de database user table
    public static ResultSet getAll(int demandedAge, Connection connection){ // voorbeeld van een getAll DAO, moeten deze voor elke mogelijke query
        String query = "SELECT user FROM user WHERE age = demandedAge";     // en elke mogelijke combinatie gemaakt worden?
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            return rs;
        } catch (SQLException exception) {
            System.err.println(exception.getMessage());
        }
        return null;
    }
    public static ResultSet get(long usernumber, Connection connection) {   // query om een user uit de lijst te halen
        String query = "SELECT FROM user WHERE userNumber = " + usernumber;
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            return rs;
        } catch (SQLException exception) {
            System.err.println(exception.getMessage());
        }
        return null;
    }
    public static void update(User user, Connection connection)  {          // query om user up te daten
        String query = "INSERT INTO user " + "VALUES (user.getUserNumber,user.getAge(),user.getEmails(), user.getPhoneNumber(),user.getFirstName(), user.getLastName())";
        try{
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
        }
        catch (SQLException exception){
            System.out.println(exception.getMessage());
        }
    }
    public static void delete(User user, Connection connection){            // query om user te deleten
        String query ="DELETE FROM users WHERE userNumber = user.getUserNumber";
        try {
            Statement st = connection.createStatement();
            st.executeUpdate(query);
        }
        catch (SQLException exception){
            System.out.println(exception.getMessage());
        }

    }
    public static void save(User user){                                     // Ik weet niet wat hier zou moeten gebeuren?

    }
}