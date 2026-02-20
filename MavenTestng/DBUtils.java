package MavenTestng;

import java.sql.*;
import java.util.*;

public class DBUtils {

    public static Object[][] getDBData() throws Exception {

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/logindb?useSSL=false&serverTimezone=UTC",
                "root",
                "Ashwini@13");     

        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select username,password from users");

        List<Object[]> list = new ArrayList<>();

        while(rs.next()) {

            String user = rs.getString("username");
            String pass = rs.getString("password");

            list.add(new Object[]{user, pass});
        }

        rs.close();
        stmt.close();
        con.close();

        Object[][] data = new Object[list.size()][];

        for(int i=0;i<list.size();i++)
            data[i]=list.get(i);

        return data;
    }
}
