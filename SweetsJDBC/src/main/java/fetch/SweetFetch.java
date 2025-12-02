package fetch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SweetFetch {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/sweets";
        String user="root";
        String password="@0995DuKe";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            String sqlFetch="select*from sweet";
            Statement statement=connection.createStatement();
            Object val=statement.executeQuery(sqlFetch);
            System.out.println(" row is fetch: "+val);


        }catch (SQLException e){
            System.out.println("Catch block exicuted");
        }
    }
}