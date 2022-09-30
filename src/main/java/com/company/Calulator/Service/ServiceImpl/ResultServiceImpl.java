package com.company.Calulator.Service.ServiceImpl;

import com.company.Calulator.DTO.ResultObject;
import com.company.Calulator.Service.ResultService;
import io.corp.calculator.TracerImpl;
import org.springframework.stereotype.Service;


@Service
public class ResultServiceImpl implements ResultService {

    private final TracerImpl tracer;

    public ResultServiceImpl(TracerImpl tracer) {
        this.tracer = tracer;
    }


    @Override
    public ResultObject sum(Float operator_1, Float operator_2) {
        ResultObject result = new ResultObject(String.valueOf(operator_1 + operator_2));
        tracer.trace("service: " + result.getResult());
        return result;
    }

    @Override
    public ResultObject subtract(Float operator_1, Float operator_2) {
        ResultObject result = new ResultObject(String.valueOf(operator_1 - operator_2));
        tracer.trace("service: " + result.getResult());
        return result;
    }
}
