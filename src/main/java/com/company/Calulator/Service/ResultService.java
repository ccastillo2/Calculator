package com.company.Calulator.Service;

import com.company.Calulator.DTO.ResultObject;

import java.math.BigDecimal;

public interface ResultService {
    ResultObject sum (BigDecimal operator_1, BigDecimal operator_2);
    ResultObject subtract (BigDecimal operator_1, BigDecimal operator_2);
}
