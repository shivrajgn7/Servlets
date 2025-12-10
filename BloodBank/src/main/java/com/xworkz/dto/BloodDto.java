package com.xworkz.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter

@ToString
public class BloodDto implements Serializable {
    private String name;
    private  String bGroup;
    private String email;
    private int age;
    private  int weight;
    private int height;
    private String gender;
    private String address;
    private long number;

    public BloodDto(String name, String bGroup, String email, int age, int weight, int height, String gender, String address, long number) {
        this.name=name;
        this.bGroup=bGroup;
        this.email=email;
        this.age=age;
        this.weight=weight;
        this.height=height;
        this.gender=gender;
        this.address=address;
        this.number=number;

    }
}
