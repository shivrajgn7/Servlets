package com.xworkz.survey.service;

import com.sun.media.sound.InvalidDataException;
import com.xworkz.survey.dto.SurveyDto;
import com.xworkz.survey.exception.SurveyException;

public class SurveyServiceImpl implements SurveyService{

    @Override
    public void ValidateAndSave(SurveyDto surveyDto) throws SurveyException {
        String name = surveyDto.getName();
        String occup = surveyDto.getOccupation();
        String education = surveyDto.getEdducation();
        boolean inValid = false;
        if (surveyDto != null) {

            if (name == null || name.length() < 4) {
                inValid=true;
            } else if (occup == null || occup.length() > 12) {
                inValid=true;
            } else if (education == null || education.length() < 2) {
                inValid=true;
            }
            if(inValid){
                throw new SurveyException("Invalid");

            }


            System.out.println("Data is Valid.saving..");
        }
        }
    }



