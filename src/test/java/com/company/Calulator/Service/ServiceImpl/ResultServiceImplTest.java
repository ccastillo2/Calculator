package com.company.Calulator.Service.ServiceImpl;

import com.company.Calulator.DTO.ResultObject;
import io.corp.calculator.TracerImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;

import static org.junit.jupiter.api.Assertions.*;


class ResultServiceImplTest {

    @MockBean
    private final ResultServiceImpl resultService = new ResultServiceImpl(new TracerImpl());

    @Test
    void sum_of_normal_values() {
        assertEquals(resultService.sum(12F, 12F).getResult(), new ResultObject("24.0").getResult());
    }

    @Test
    void sum_of_positive_extrem_values() {
        String temp = String.valueOf(Float.MAX_VALUE + Float.MAX_VALUE);
        assertEquals(resultService.sum(Float.MAX_VALUE, Float.MAX_VALUE).getResult(), new ResultObject(temp).getResult());
    }

    @Test
    void sum_of_negative_extrem_values() {
        String temp = String.valueOf(Float.MIN_VALUE + Float.MIN_VALUE);
        assertEquals(resultService.sum(Float.MIN_VALUE, Float.MIN_VALUE).getResult(), new ResultObject(temp).getResult());
    }

    @Test
    void sum_of_positive_and_negative_extrem_values() {
        String temp = String.valueOf(Float.MAX_VALUE + Float.MIN_VALUE);
        assertEquals(resultService.sum(Float.MAX_VALUE, Float.MIN_VALUE).getResult(), new ResultObject(temp).getResult());
    }

    @Test
    void sum_of_negative_and_positive_extrem_values() {
        String temp = String.valueOf(Float.MIN_VALUE + Float.MAX_VALUE);
        assertEquals(resultService.sum(Float.MIN_VALUE, Float.MAX_VALUE).getResult(), new ResultObject(temp).getResult());
    }


    @Test
    void subtract_of_normal_values() {
        assertEquals(resultService.subtract(12F, 12F).getResult(), new ResultObject("0.0").getResult());
    }

    @Test
    void subtract_of_positive_extrem_values() {
        String temp = String.valueOf(0.0F);
        assertEquals(resultService.subtract(Float.MAX_VALUE, Float.MAX_VALUE).getResult(), new ResultObject(temp).getResult());
    }

    @Test
    void subtract_of_negative_extrem_values() {
        String temp = String.valueOf(0.0F);
        assertEquals(resultService.subtract(Float.MIN_VALUE, Float.MIN_VALUE).getResult(), new ResultObject(temp).getResult());
    }

    @Test
    void subtract_of_positive_and_negative_extrem_values() {
        String temp = String.valueOf(Float.MAX_VALUE - Float.MIN_VALUE);
        assertEquals(resultService.subtract(Float.MAX_VALUE, Float.MIN_VALUE).getResult(), new ResultObject(temp).getResult());
    }

    @Test
    void subtract_of_negative_and_positive_extrem_values() {
        String temp = String.valueOf(Float.MIN_VALUE - Float.MAX_VALUE);
        assertEquals(resultService.subtract(Float.MIN_VALUE, Float.MAX_VALUE).getResult(), new ResultObject(temp).getResult());
    }
}