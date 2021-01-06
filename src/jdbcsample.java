import java.sql.*;


public class jdbcsample {
    private static final String SQL = "SELECT id, firstname, fee From students WHERE fee <= ?";

    public static void main(String[] args) throws SQLException {

        double maxfee;

        try {
            Connection con = DBConnection.getConnection();
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            System.out.println("Connected");
            System.out.println(rs.getRow());

//            students.getStudents(rs);
//            students.getStudent(rs, 3);
            maxfee = Input.getInt("Enter a maximum fee");


        }   catch (SQLException e) {
            System.err.println("Error: Invalid Number");
            return;
        }

        ResultSet rs = null;


    }
}