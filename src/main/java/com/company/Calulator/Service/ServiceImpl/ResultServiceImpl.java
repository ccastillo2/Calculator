package com.company.Calulator.Service.ServiceImpl;

import com.company.Calulator.DTO.ResultObject;
import com.company.Calulator.Service.ResultService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ResultServiceImpl implements ResultService {

    @Override
    public ResultObject sum(BigDecimal operator_1, BigDecimal operator_2) {
        return new ResultObject((operator_1.add(operator_2)).toString());
    }

    @Override
    public ResultObject subtract(BigDecimal operator_1, BigDecimal operator_2) {
        return new ResultObject((operator_1.subtract(operator_2)).toString());
    }
}
