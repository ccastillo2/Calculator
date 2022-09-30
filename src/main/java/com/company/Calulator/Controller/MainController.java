package com.company.Calulator.Controller;

import com.company.Calulator.DTO.ResultObject;
import com.company.Calulator.Service.ServiceImpl.ResultServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping(name="/")
public class MainController {

    @Autowired
    private ResultServiceImpl resultServiceImpl;

    @GetMapping(value = "/Sum/operator_1/{operator_1}/operator_2/{operator_2}")
    public ResultObject Sum (@PathVariable(value = "operator_1") Float operator_1, @PathVariable(value = "operator_2") Float operator_2){
        return resultServiceImpl.sum(operator_1, operator_2);
    }

    @GetMapping(value = "Subtract/operator_1/{operator_1}/operator_2/{operator_2}")
    public ResultObject Subtract (@PathVariable(value = "operator_1") Float operator_1, @PathVariable (value = "operator_2") Float operator_2){
        return resultServiceImpl.subtract(operator_1, operator_2);
    }
}
