package com.xworkz.service;

import com.xworkz.dto.BloodDto;
import com.xworkz.dto.SearchDto;
import com.xworkz.exception.BloodInvalidException;

import java.sql.SQLException;
import java.util.Optional;

public interface BloodService {
    public void validSave(BloodDto bloodDto)throws SQLException, BloodInvalidException;

    default Optional<BloodDto> findByPhone(SearchDto bloodDto){
        return Optional.empty();
    }
}
