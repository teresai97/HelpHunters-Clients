import java.util.Vector;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClientData {
    int    clientID;
    String firstname;
    String   lastname;
    String email;
    String  password;
    int gender;

    ClientData (int clientID, String firstname, String lastname, String email, String password) {
        this.clientID   = clientID;
        this.firstname  = firstname;
        this.lastname  = lastname;
        this.email = email;
        this.password = password;
    }
}