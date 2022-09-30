package com.company.Calulator.Service.ServiceImpl;

import com.company.Calulator.DTO.ResultObject;
import com.company.Calulator.Service.ResultService;
import com.fasterxml.jackson.core.io.BigDecimalParser;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ResultServiceImpl implements ResultService {

    @Override
    public ResultObject sum(Float operator_1, Float operator_2) {
        return new ResultObject(String.valueOf(operator_1 + operator_2));
    }

    @Override
    public ResultObject subtract(Float operator_1, Float operator_2) {
        return new ResultObject(String.valueOf(operator_1 - operator_2));
    }
}
