package com.fintness.service;

import com.fintness.Dto.FitnessDto;
import com.fintness.exeception.InvalidException;

public interface FitnessService {

    void validate(FitnessDto fitnessDto) throws InvalidException;

}
