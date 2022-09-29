package com.company.Calulator.Controller;

import com.company.Calulator.DTO.ResultObject;
import com.company.Calulator.Service.ServiceImpl.ResultServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping(name="/")
public class MainController {

    @Autowired
    private ResultServiceImpl resultServiceImpl;

    @GetMapping(value = "/Sum/operator_1/{operator_1}/operador_2/{operador_2}")
    public ResultObject Sum (@PathVariable(value = "operator_1") BigDecimal operator_1, @PathVariable(value = "operator_2") BigDecimal operator_2){
        return resultServiceImpl.sum(operator_1, operator_2);
    }

    @GetMapping(value = "Subtract/operator_1/{operator_1}/operator_2/{operator_2}")
    public ResultObject Subtract (@PathVariable(value = "operator_1") BigDecimal operator_1, @PathVariable (value = "operator_2") BigDecimal operator_2){
        return resultServiceImpl.subtract(operator_1, operator_2);
    }
}
