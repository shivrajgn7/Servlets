package com.fintness.Dao;

import com.fintness.Dto.FitnessDto;

public interface FitnessDao<GEN> {
    GEN saveSuccess(FitnessDto fitnessDto);


}
