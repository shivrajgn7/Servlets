package com.xworkz.constant;

import com.xworkz.dto.BloodDto;

public enum BloodDB {
    URL("jdbc:mysql://localhost:3306/bloodBank"),
    USER("root"),
    Password("0995DuKe");

    private String value;

     BloodDB(String value){
        this.value=value;

    }

    public String getValue() {
        return value;
    }
}
