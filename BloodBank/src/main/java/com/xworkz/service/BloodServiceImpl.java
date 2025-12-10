package com.xworkz.service;

import com.xworkz.dao.BloodDao;
import com.xworkz.dao.BloodDaoImpl;
import com.xworkz.dto.BloodDto;
import com.xworkz.dto.SearchDto;
import com.xworkz.exception.BloodInvalidException;

import java.sql.SQLException;
import java.util.Optional;

public class BloodServiceImpl implements BloodService{
    BloodDaoImpl bloodDao=new BloodDaoImpl();
    @Override
    public void validSave(BloodDto bloodDto) throws SQLException, BloodInvalidException {
        System.out.println("Validation is started");

        boolean inValid=false;

            if(bloodDto!=null) {
                if (bloodDto.getName() == null || bloodDto.getName().length() >= 15) {
                    inValid = true;

                }
                if (bloodDto.getEmail() == null || bloodDto.getEmail().length() >= 30) {
                    inValid = true;
                }
                if (bloodDto.getBGroup() == null) {
                    inValid = true;
                }
                if (bloodDto.getAge() == 0 || bloodDto.getAge() < 16 || bloodDto.getAge() > 50) {
                    inValid = true;
                }
                if (bloodDto.getWeight() == 0 || bloodDto.getWeight() < 50) {
                    inValid = true;
                }
                if (bloodDto.getHeight() == 0 || bloodDto.getHeight() > 300) {
                    inValid = true;

                }
                if (bloodDto.getGender() == null) {
                    inValid = true;

                }
                if (bloodDto.getAddress() == null || bloodDto.getAddress().length() >= 50) {
                    inValid = true;
                }
                if (bloodDto.getNumber() == 0 ) {
                    inValid = true;

                }
            }

        if(inValid){
            System.out.println("Validation got stuck ");
            throw  new BloodInvalidException("Input missmatch");
        }else {
            bloodDao.saveSuccess(bloodDto);
            System.out.println("Validation is success");
        }


    }
    @Override
    public Optional<BloodDto> findByPhone(SearchDto searchDto){
        boolean inValid=false;
        long phone=searchDto.getNumber();
        if(searchDto.getNumber()==0|| searchDto.getNumber()>9999999999l){
            System.err.println("Number is not valid");
            inValid=true;
        }
        if(!inValid){
            System.out.println("Number is valid we can cll DAO ");
            Optional<BloodDto> optionalBloodDto=this.bloodDao.findByDaoNumber(phone);
            System.out.println("Optional dto is Present: "+optionalBloodDto.isPresent());
            return optionalBloodDto;
        }
        return BloodService.super.findByPhone(searchDto);

    }
   }
