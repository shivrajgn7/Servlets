package delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SweetDelete {

    public static void main(String[] args) {


        String url = "jdbc:mysql://localhost:3306/sweets";
        String user = "root";
        String password = "@0995DuKe";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Try block is exicuted: " + connection);
            String sqlDelete1 = "delete from sweet where s_name in ('gulab jamun') ";
            String sqlDelete2 = " delete from sweet where s_id=2";
            String sqlDelete3 = " delete from sweet where s_id between 1 and 10";
            String sqlDelete4 = " delete from sweet where s_id=50";

            Statement statement = connection.createStatement();
            int row1 = statement.executeUpdate(sqlDelete1);
            int row2 = statement.executeUpdate(sqlDelete2);
            int row3 = statement.executeUpdate(sqlDelete3);
            int row4 = statement.executeUpdate(sqlDelete4);

            System.out.println("1 row is affected: " + row1);
            System.out.println("2 row is affected: " + row2);
            System.out.println("3 row is affected: " + row3);
            System.out.println("4 row is affected: " + row4);


        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("catch block is exicuted");
        }
    }
}