package dbUtil;

import java.io.ObjectInputFilter.Config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {

    Connection conn = null;

    public static Connection getConnection() {
        try {
            String USERNAME = "";
            String PASSWORD = "";
            String URL = "";
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
