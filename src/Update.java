import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Update {
    private static final String SQL = "ALTER TABLE students ADD Fee double";
    public static void main(String[] args) throws SQLException {
        ResultSet rs = null;

        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(SQL);

            stmt.executeUpdate();

        } catch (
                SQLException e) {
            System.err.println(e);
        } finally {
            if (rs != null) {
                rs.close();
            }
        }
    }
}
