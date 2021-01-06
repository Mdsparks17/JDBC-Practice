import java.sql.*;


public class jdbcsample2 {
    private static final String SQL = "SELECT * From students WHERE fee <= ?";
    public static void main(String[] args) throws SQLException {

        double maxfee;

        try {
            maxfee = Input.getInt("Enter a maximum fee: ");
        }   catch (Exception e) {
            System.err.println("Error: Invalid number");
            return;
        }

       ResultSet rs = null;

        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(SQL, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            stmt.setDouble(1, maxfee);

            rs = stmt.executeQuery();
            students.getStudents(rs);

        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            if(rs != null){
                rs.close();
            }
        }
    }
}