package com.xworkz.dao;

import com.xworkz.dto.BloodDto;

import java.util.Optional;

public interface BloodDao {
    public boolean saveSuccess(BloodDto bloodDto);

    default Optional<BloodDto> findByDaoNumber(long number){
        return Optional.empty();
    }

}
