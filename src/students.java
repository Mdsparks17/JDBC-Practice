import java.sql.ResultSet;
import java.sql.SQLException;

public class students {
    public static void getStudents(ResultSet rs) throws SQLException {
        while (rs.next()) {
            StringBuffer buffer = new StringBuffer();

            buffer.append("Student Name: " + rs.getString("first_name") + " " + rs.getString("last_name"));
            buffer.append(" (" + rs.getInt("id") + ") ");

            buffer.append(rs.getDate("dob"));

            System.out.println(buffer.toString());
        }
    }

    public static void getStudent(ResultSet rs, int index) throws SQLException {
        rs.absolute(index);

        StringBuffer buffer = new StringBuffer();

        buffer.append("Student Name: " + rs.getString("first_name") + " " + rs.getString("last_name"));
        buffer.append(" (" + rs.getInt("id") + ") ");

        buffer.append(rs.getDate("dob"));

        System.out.println(buffer.toString());
    }
}
