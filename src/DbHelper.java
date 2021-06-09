

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbHelper {
    private String HostName = "localhost";
    private String Uname = "root";
    private String Pass = "";
    private String DbName = "college_management_system";

    Connection conn;
    PreparedStatement st;

    public DbHelper() throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://" + HostName + ":3306" + "/" + DbName;
        Class.forName("com.mysql.jdbc.Driver");
        conn = (Connection) DriverManager.getConnection(url, Uname, Pass);
        //  st= (PreparedStatement) conn.prepareStatement("CREATE TABLE IF NOT EXISTS `student` (\n" +
//             "  `id` int(11) NOT NULL,\n" +
//             "  `name` varchar(100) NOT NULL,\n" +
//             "  `roll` varchar(500) NOT NULL,\n" +
//             "  `email` varchar(500) NOT NULL,\n" +
//             "  `mnumber` int(50) NOT NULL,\n" +
//             "  `uid` varchar(50) NOT NULL\n" +
//             ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;");

    }

    void Stinsert(String name, Integer roll, String email, Double mnumber, String uid) throws SQLException {
        String Insert = "INSERT INTO student (name,roll,email,mnumber,uid)VALUES(?,?,?,?,?)";
        st = (PreparedStatement) conn.prepareStatement(Insert);
        st.setString(1, name);
        st.setInt(2, roll);
        st.setString(3, email);
        st.setDouble(4, mnumber);
        st.setString(5, uid);
        if (st.execute(Insert)) {
            System.out.println("inserted");
        }

        conn.close();
    }

}
