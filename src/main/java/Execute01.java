import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Execute01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1. Step: Register to the Driver
        Class.forName(  "org.postgresql.Driver");

        //2. Step: Connect to Database
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","suatvsqoqo1997");

        //3. Step: Create statement
        Statement st = con.createStatement();

        System.out.println("Connection Success");

    }
}
