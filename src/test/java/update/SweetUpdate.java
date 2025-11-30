package update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SweetUpdate {
    public static void main(String[] args) {


        String url = "jdbc:mysql://localhost:3306/sweets";
        String user = "root";
        String password = "@0995DuKe";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Try block is exicuted: "+connection);
            String sqlUpdate1=" update sweet set s_name='paneer halwa', cateory='solid',ingrident='suger' , price=100 where s_id=74";
            String sqlUpdate2=" update sweet set s_name='Rava ladoo', cateory='flaky',ingrident='rice floor' , price=100 where s_id=73";
            String sqlUpdate3=" update sweet set s_name='pithe', cateory='soft',ingrident='chocolate' , price=100 where s_id=72";
            String sqlUpdate4=" update sweet set s_name='obbattu', cateory='soft',ingrident='coconut' , price=100 where s_id=71";

            Statement statement=connection.createStatement();
            int row1=statement.executeUpdate(sqlUpdate1);
            int row2=statement.executeUpdate(sqlUpdate2);
            int row3=statement.executeUpdate(sqlUpdate3);
            int row4=statement.executeUpdate(sqlUpdate4);

            System.out.println("1 row is affected: "+row1);
            System.out.println("2 row is affected: "+row2);
            System.out.println("3 row is affected: "+row3);
            System.out.println("4 row is affected: "+row4);
            System.out.println("Is in try");

        }catch (SQLException e){
            e.printStackTrace();
            System.out.println("catch block is exicuted");
        }
    }
}