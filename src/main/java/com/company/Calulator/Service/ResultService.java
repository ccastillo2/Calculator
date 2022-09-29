package com.company.Calulator.Service;

import java.math.BigDecimal;

public interface ResultService {
    ResultObject sum (BigDecimal operator_1, BigDecimal operator_2);
    ResultObject Subtract (BigDecimal operator_1, BigDecimal operator_2);
}
