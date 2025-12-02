package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SweetInsert {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/sweets";
        String user="root";
        String password="@0995DuKe";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            //s_id int ,s_name varchar(25),cateory varchar(20),ingrident varchar(20),flavor varchar(20),origin varchar(20),price double);
            System.out.println("Connection is exicuted"+connection);
            String sqlQuery="insert into sweet values(1,'gulab jamun','deep-fried','milk,ghee,','sweet','india',240)";
            String sqlQuery1="insert into sweet values(2,'Rasgulla','chhena','cheese','sweet','India',230)";
            String sqlQuery2="insert into sweet values(3,'Jalebi','Fried','Flour (maida)','Sweet, tangy','India',233)";
            String sqlQuery3="insert into sweet values(4,'Barfi','Milk-based fudge','Milk solids','Milky, rich, sweet (many variations)','India',140)";
            String sqlQuery4="insert into sweet values(5,'Ladoo','syrup-based','Gram','sweet','India',250)";
            String sqlQuery6="insert into sweet values(6,'Halwa','syrup-Pudding-like, cooked','semolina','creamy','India',140)";
            String sqlQuery7="insert into sweet values(7,'Kheer','Rice or vermicelli pudding','Rice or vermicelli','sweet','India',220)";
            String sqlQuery8="insert into sweet values(8,'Rasmalai','Cheese-based, milk-based','sugar','sweet','India',300)";String sqlQuery9="insert into sweet values(2,'Rasgulla','chhena','cheese','sweet','India',230)";
            String sqlQuery10 ="insert into sweet values(10,'Peda','semi-soft','Milk','Milky','India',20)";
            String sqlQuery12= "insert into sweet values(12,'Kheer','liquid','Rice','Milky','India',30)";
            String sqlQuery13= "insert into sweet values(13,'Mysore Pak','crumbly','Gram Flour','Ghee','Karnataka',35)";
            String sqlQuery14 = "insert into sweet values(14,'Modak','soft','Rice Flour','Coconut','Maharashtra',20)";
            String sqlQuery15= "insert into sweet values(15,'Phirni','soft','Rice','Creamy','Kashmir',25)";
            String sqlQuery16 = "insert into sweet values(16,'Balushahi','crispy','Flour','Sugary','UP',25)";
            String sqlQuery17 = "insert into sweet values(17,'Shrikhand','creamy','Curd','Mango','Maharashtra',40)";
            String sqlQuery18= "insert into sweet values(18,'Kheer Kadam','soft','Milk','Sweet','Bengal',30)";
            String sqlQuery19 = "insert into sweet values(19,'Gajar Halwa','soft','Carrot','Milky','Punjab',35)";
            String sqlQuery20 = "insert into sweet values(20,'Sooji Halwa','soft','Semolina','Sweet','India',15)";
            String sqlQuery21 = "insert into sweet values(21,'Kesari Bath','soft','Semolina','Kesar','Karnataka',25)";
            String sqlQuery22= "insert into sweet values(22,'Payasam','liquid','Milk','Milky','Kerala',30)";
            String sqlQuery23 = "insert into sweet values(23,'Pineapple Sheera','soft','Sooji','Fruity','Goa',20)";
            String sqlQuery24= "insert into sweet values(24,'Besan Barfi','solid','Besan','Nutty','North India',30)";
            String sqlQuery25 = "insert into sweet values(25,'Boondi Ladoo','soft','Besan','Sweet','India',15)";
            String sqlQuery26 ="insert into sweet values(26,'Tilgul','hard','Sesame','Jaggery','Maharashtra',10)";
            String sqlQuery27 ="insert into sweet values(27,'Anjeer Barfi','solid','Figs','Dry Fruit','India',60)";
            String sqlQuery28 ="insert into sweet values(28,'Dry Fruit Ladoo','soft','Nuts','Nutty','India',70)";
            String sqlQuery29="insert into sweet values(29,'Chikki','hard','Peanuts','Jaggery','Maharashtra',10)";
            String sqlQuery30= "insert into sweet values(30,'Kulfi','frozen','Milk','Malai','India',40)";
            String sqlQuery31 ="insert into sweet values(31,'Rasmalai','soft','Chhena','Milky','Bengal',50)";
            String sqlQuery32 ="insert into sweet values(32,'Chena Poda','baked','Chhena','Caramel','Odisha',45)";
            String sqlQuery33="insert into sweet values(33,'Puran Poli','soft','Chana Dal','Jaggery','Maharashtra',25)";
            String sqlQuery34 ="insert into sweet values(34,'Kalakand','soft','Milk','Sweet','Rajasthan',35)";
            String sqlQuery35= "insert into sweet values(35,'Badam Halwa','soft','Almond','Ghee','South India',60)";
            String sqlQuery36= "insert into sweet values(36,'Sohan Papdi','flaky','Gram Flour','Sweet','Pakistan',20)";
            String sqlQuery37 = "insert into sweet values(37,'Dry Jamun','soft','Khoya','Sweet','India',30)";
            String sqlQuery38= "insert into sweet values(38,'Makhana Kheer','liquid','Makhana','Milky','Bihar',40)";
            String sqlQuery39= "insert into sweet values(39,'Paneer Halwa','soft','Paneer','Sweet','North India',30)";
            String sqlQuery40 = "insert into sweet values(40,'Rava Ladoo','soft','Sooji','Sweet','India',15)";
            String sqlQuery41 ="insert into sweet values(41,'Coconut Barfi','solid','Coconut','Sweet','South India',20)";
            String sqlQuery42 ="insert into sweet values(42,'Coconut Ladoo','soft','Coconut','Milky','India',20)";
            String sqlQuery43 ="insert into sweet values(43,'Ghevar','crispy','Flour','Sugary','Rajasthan',50)";
            String sqlQuery44 ="insert into sweet values(44,'Imarti','crispy','Urad Dal','Sweet','UP',20)";
            String sqlQuery45 = "insert into sweet values(45,'Kharwas','soft','Colostrum Milk','Sweet','Maharashtra',30)";
            String sqlQuery46= "insert into sweet values(46,'Pathishapta','soft','Rice Flour','Coconut','Bengal',25)";
            String sqlQuery47 ="insert into sweet values(47,'Ada Pradhaman','liquid','Rice','Jaggery','Kerala',40)";
            String sqlQuery48 = "insert into sweet values(48,'Obbattu','soft','Chana Dal','Jaggery','Karnataka',20)";
            String sqlQuery49 ="insert into sweet values(49,'Pithe','soft','Rice','Molasses','Bengal',25)";
            String sqlQuery50 ="insert into sweet values(50,'Sakkarai Pongal','soft','Rice','Jaggery','Tamil Nadu',30)";
            String sqlQuery51 ="insert into sweet values(51,'Manoharam','crunchy','Rice Flour','Jaggery','Tamil Nadu',20)";
            String sqlQuery52 ="insert into sweet values(52,'Mango Barfi','solid','Milk','Mango','India',30)";
            String sqlQuery53 ="insert into sweet values(53,'Rose Barfi','solid','Milk','Rose','India',30)";
            String sqlQuery54 ="insert into sweet values(54,'Kesar Peda','semi-soft','Milk','Kesar','UP',35)";
            String sqlQuery55="insert into sweet values(55,'Kesar Rabdi','creamy','Milk','Kesar','North India',45)";
            String sqlQuery56 ="insert into sweet values(56,'Apple Halwa','soft','Apple','Sweet','India',30)";
            String sqlQuery57 = "insert into sweet values(57,'Banana Halwa','soft','Banana','Sweet','Kerala',30)";
            String sqlQuery58 ="insert into sweet values(58,'Dates Barfi','solid','Dates','Dry Fruit','India',50)";
            String sqlQuery59 ="insert into sweet values(59,'Khajur Ladoo','soft','Dates','Jaggery','India',45)";
            String sqlQuery60 ="insert into sweet values(60,'Chhena Gaja','soft','Chhena','Sweet','Odisha',35)";
            String sqlQuery61 ="insert into sweet values(61,'Kozhukattai','soft','Rice','Coconut','Tamil Nadu',20)";
            String sqlQuery62 ="insert into sweet values(62,'Ellu Urundai','hard','Sesame','Jaggery','Tamil Nadu',15)";
            String sqlQuery63="insert into sweet values(63,'Sweet Pongal','soft','Rice','Jaggery','South India',30)";
            String sqlQuery64= "insert into sweet values(64,'Pumpkin Halwa','soft','Pumpkin','Ghee','India',25)";
            String sqlQuery65= "insert into sweet values(65,'Jackfruit Payasam','liquid','Jackfruit','Milky','Kerala',40)";
            String sqlQuery66 ="insert into sweet values(66,'Carrot Barfi','solid','Carrot','Sweet','India',30)";
            String sqlQuery67 ="insert into sweet values(67,'Milk Cake','semi-soft','Milk','Sweet','Rajasthan',40)";
            String sqlQuery68 ="insert into sweet values(68,'Khoya Barfi','solid','Khoya','Sweet','India',30)";
            String sqlQuery69 ="insert into sweet values(69,'Kaju Roll','solid','Cashew','Sweet','India',60)";
            String sqlQuery70 ="insert into sweet values(70,'Til Ladoo','hard','Sesame','Jaggery','India',15)";
            String sqlQuery71="insert into sweet values(71,'Pista Barfi','solid','Pistachio','Nutty','India',55)";
            String sqlQuery72 ="insert into sweet values(72,'Mawa Ladoo','soft','Khoya','Sweet','India',25)";
            String sqlQuery73 ="insert into sweet values(73,'Moong Dal Halwa','soft','Moong Dal','Ghee','Rajasthan',50)";
            String sqlQuery74 ="insert into sweet values(74,'Shahi Tukda','soft','Bread','Creamy','Hyderabad',45)";
            String sqlQuery75 ="insert into sweet values(75,'Double Ka Meetha','soft','Bread','Milky','Hyderabad',40)";







            Statement statement=connection.createStatement();
            statement.executeUpdate(sqlQuery75);
            statement.executeUpdate(sqlQuery74);
            statement.executeUpdate(sqlQuery73);
            statement.executeUpdate(sqlQuery72);
            statement.executeUpdate(sqlQuery71);
            statement.executeUpdate(sqlQuery70);
            statement.executeUpdate(sqlQuery69);
            statement.executeUpdate(sqlQuery68);
            statement.executeUpdate(sqlQuery67);
            statement.executeUpdate(sqlQuery66);
            statement.executeUpdate(sqlQuery65);
            statement.executeUpdate(sqlQuery64);
            statement.executeUpdate(sqlQuery63);
            statement.executeUpdate(sqlQuery62);
            statement.executeUpdate(sqlQuery61);
            statement.executeUpdate(sqlQuery60);
            statement.executeUpdate(sqlQuery59);
            statement.executeUpdate(sqlQuery58);
            statement.executeUpdate(sqlQuery57);
            statement.executeUpdate(sqlQuery56);
            statement.executeUpdate(sqlQuery55);
            statement.executeUpdate(sqlQuery54);
            statement.executeUpdate(sqlQuery53);
            statement.executeUpdate(sqlQuery52);
            statement.executeUpdate(sqlQuery51);
            statement.executeUpdate(sqlQuery50);
            statement.executeUpdate(sqlQuery49);
            statement.executeUpdate(sqlQuery48);
            statement.executeUpdate(sqlQuery47);
            statement.executeUpdate(sqlQuery46);
            statement.executeUpdate(sqlQuery45);
            statement.executeUpdate(sqlQuery44);
            statement.executeUpdate(sqlQuery43);
            statement.executeUpdate(sqlQuery42);
            statement.executeUpdate(sqlQuery41);
            statement.executeUpdate(sqlQuery40);
            statement.executeUpdate(sqlQuery39);
            statement.executeUpdate(sqlQuery38);
            statement.executeUpdate(sqlQuery37);
            statement.executeUpdate(sqlQuery36);
            statement.executeUpdate(sqlQuery35);
            statement.executeUpdate(sqlQuery34);
            statement.executeUpdate(sqlQuery33);
            statement.executeUpdate(sqlQuery32);
            statement.executeUpdate(sqlQuery31);
            statement.executeUpdate(sqlQuery30);
            statement.executeUpdate(sqlQuery29);
            statement.executeUpdate(sqlQuery28);
            statement.executeUpdate(sqlQuery27);
            statement.executeUpdate(sqlQuery26);
            statement.executeUpdate(sqlQuery25);
            statement.executeUpdate(sqlQuery24);
            statement.executeUpdate(sqlQuery23);
            statement.executeUpdate(sqlQuery22);
            statement.executeUpdate(sqlQuery21);
            statement.executeUpdate(sqlQuery20);
            statement.executeUpdate(sqlQuery19);
            statement.executeUpdate(sqlQuery18);
            statement.executeUpdate(sqlQuery17);
            statement.executeUpdate(sqlQuery16);
            statement.executeUpdate(sqlQuery15);
            statement.executeUpdate(sqlQuery14);
            statement.executeUpdate(sqlQuery13);
            statement.executeUpdate(sqlQuery12);
            statement.executeUpdate(sqlQuery10);
            statement.executeUpdate(sqlQuery8);
            statement.executeUpdate(sqlQuery7);
            statement.executeUpdate(sqlQuery6);
            statement.executeUpdate(sqlQuery4);
            statement.executeUpdate(sqlQuery3);
            statement.executeUpdate(sqlQuery2);
            int rowaffected=statement.executeUpdate(sqlQuery);
            statement.executeUpdate(sqlQuery1);
            System.out.println("row is affected"+rowaffected);


        } catch (SQLException e) {
            System.out.println("catch block is exicuted");
            e.printStackTrace();
        }

    }
}