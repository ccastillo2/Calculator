package com.company.Calulator.Controller;

import com.company.Calulator.Service.ServiceImpl.ResultServiceImpl;
import io.corp.calculator.TracerImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = MainController.class)
class MainControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ResultServiceImpl resultService;

    @MockBean
    TracerImpl tracer;

    @Test
    void sum_ok_200() throws Exception {
        mockMvc.perform(get("/Sum/operator_1/{operator_1}/operator_2/{operator_2}", 12F, 12F)
                .contentType("application/json"))
                .andExpect(status().isOk());
    }

    @Test
    void sum_NoOk_400() throws Exception {
        mockMvc.perform(get("/Sum/operator_1/{operator_1}/operator_2/{operator_2}","asd",0F)
                        .contentType("application/json"))
                .andExpect(status().isBadRequest());
    }

    @Test
    void sum_NoOk_404() throws Exception {
        mockMvc.perform(get("/Sum/operator_1/{operator_1}/operator_3/{operator_2}", 12F, 12F)
                        .contentType("application/json"))
                .andExpect(status().isNotFound());
    }

    @Test
    void sum_NoOk_405() throws Exception {
        mockMvc.perform(put("/Sum/operator_1/{operator_1}/operator_2/{operator_2}", 12F, 12F)
                        .contentType("application/json"))
                .andExpect(status().isMethodNotAllowed());
    }

    @Test
    void subtract_ok_200() throws Exception {
        mockMvc.perform(get("/Subtract/operator_1/{operator_1}/operator_2/{operator_2}", 13F, 12F)
                        .contentType("application/json"))
                .andExpect(status().isOk());
    }

    @Test
    void subtract_NoOk_400() throws Exception {
        mockMvc.perform(get("/Subtract/operator_1/{operator_1}/operator_2/{operator_2}","as",12F)
                        .contentType("application/json"))
                .andExpect(status().isBadRequest());
    }

    @Test
    void subtract_NoOk_404() throws Exception {
        mockMvc.perform(get("/Subtract/operator_1/{operator_1}/operator_3/{operator_2}", 12F, 12F)
                        .contentType("application/json"))
                .andExpect(status().isNotFound());
    }

    @Test
    void subtract_NoOk_405() throws Exception {
        mockMvc.perform(put("/Subtract/operator_1/{operator_1}/operator_2/{operator_2}", "as", 12F)
                        .contentType("application/json"))
                .andExpect(status().isMethodNotAllowed());
    }

}