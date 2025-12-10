package com.xworkz.dao;

import com.xworkz.constant.BloodDB;
import com.xworkz.dto.BloodDto;
import lombok.SneakyThrows;

import java.sql.*;
import java.util.Optional;

public class BloodDaoImpl implements BloodDao{
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("class name");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    String url="jdbc:mysql://localhost:3306/bloodBank";
    String user="root";
    String password="@0995DuKe";

@SneakyThrows
    @Override
    public boolean saveSuccess(BloodDto bloodDto) {
    System.out.println("Save method is started");
    boolean isSaved=false;
    String sqlQuery="insert into donor1(b_id,name,b_group, email,age,weight,height,gender,address,b_number) values (?,?,?,?,?,?,?,?,?,?)";


    try (Connection connection= DriverManager.getConnection(url,user,password);
     PreparedStatement preparedStatement=connection.prepareStatement(sqlQuery))   {
        System.out.println("JDBC Inserting is Started");
        preparedStatement.setLong(1,bloodDto.getId());
        preparedStatement.setString(2,bloodDto.getName());
        preparedStatement.setString(3,bloodDto.getBGroup());
        preparedStatement.setString(4,bloodDto.getEmail());
        preparedStatement.setInt(5,bloodDto.getAge());
        preparedStatement.setInt(6,bloodDto.getWeight());
        preparedStatement.setInt(7,bloodDto.getHeight());
        preparedStatement.setString(8,bloodDto.getGender());
        preparedStatement.setString(9,bloodDto.getAddress());
        preparedStatement.setLong(10,bloodDto.getNumber());

        int rows=preparedStatement.executeUpdate();
        System.out.println("Row is inserted: "+rows);

        System.out.println("JDBC inserting is ended");

        }catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
        return false;
    }
    @SneakyThrows
    @Override
    public Optional<BloodDto> findByDaoNumber(long number){

    String searchQuery="select * from donor1  where b_number=?";
        System.out.println("Searched number: "+searchQuery);
    try(Connection connection=DriverManager.getConnection(url,user,password);
    PreparedStatement preparedStatement=connection.prepareStatement(searchQuery)) {
        System.out.println("Find by Dao is Running ");

        preparedStatement.setLong(1, number);

        ResultSet resultSet=preparedStatement.executeQuery();
        while (resultSet.next()) {
            String name = resultSet.getString(2);
            String b_group = resultSet.getString(3);
            String email = resultSet.getString(4);
            int age = resultSet.getInt(5);
            int weight = resultSet.getInt(6);
            int height = resultSet.getInt(7);
            String gender = resultSet.getString(8);
            String address = resultSet.getString(9);
            long contact = resultSet.getLong(10);
            BloodDto bloodDto = new BloodDto(name, b_group, email, age, weight, height, gender, address, number);
            System.out.println("Fist DTO from DB :" + bloodDto);
            return Optional.of(bloodDto);
        }
    }
        System.out.println("Result set no rows found..");

        return Optional.empty();

    }
}
