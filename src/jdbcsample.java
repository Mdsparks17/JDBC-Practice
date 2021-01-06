import java.sql.*;


public class jdbcsample {

    public static void main(String[] args) throws SQLException {

        try {
            Connection con = DBConnection.getConnection();
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

//            System.out.println("Connected");
//            System.out.println(rs.getRow());

//            students.getStudents(rs);
            students.getStudent(rs, 3);


        }   catch (SQLException e) {

        }

        ResultSet rs = null;

    }
}