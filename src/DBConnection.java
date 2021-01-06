import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String USERNAME = "mdsparks";
    private static final String PASSWORD = "12411721";
    private static final String CONN = "jdbc:mysql://localhost/school";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(CONN, USERNAME, PASSWORD);
    }

}
