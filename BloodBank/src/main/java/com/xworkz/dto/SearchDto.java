package com.xworkz.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

public class SearchDto implements Serializable {

    @Getter
    @Setter

    private long number;

    public SearchDto(long number){
        this.number=number;
    }
}
