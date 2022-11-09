package dbUtil;

import java.io.ObjectInputFilter.Config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {

    Connection conn = null;

    public static Connection getConnection() {
        try {
            String USERNAME = "postgres";
            String PASSWORD = "2bfw3uPuyUzvDRBX";
            String URL = "jdbc:postgresql://db.plbuoqmxofuihydrbcdn.supabase.co:5432/postgres";
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
