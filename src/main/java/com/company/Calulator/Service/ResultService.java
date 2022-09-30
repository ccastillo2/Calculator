package com.company.Calulator.Service;

import com.company.Calulator.DTO.ResultObject;


public interface ResultService {
    ResultObject sum (Float operator_1, Float operator_2);
    ResultObject subtract (Float operator_1, Float operator_2);
}
