package com.estech.springiniciacion.service;

import org.springframework.stereotype.Service;

@Service
public class IsAdultService {

    public String getAge(Integer age){
        String isAdult = age >= 18 ? "Mayor de edad" : "Menor de edad";
        return isAdult;
    }


}
