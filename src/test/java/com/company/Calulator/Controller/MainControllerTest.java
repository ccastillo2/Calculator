package com.company.Calulator.Controller;

import com.company.Calulator.Service.ServiceImpl.ResultServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = MainController.class)
class MainControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @InjectMocks
    private ResultServiceImpl resultService;

    @Test
    void sum_ok() throws Exception {
        mockMvc.perform(get("/Sum/operator_1/{operator_1}/operator_2/{operator_2}", 12F)
                .contentType("application/json"))
                .andExpect(status().is2xxSuccessful());
    }

    @Test
    void subtract() {
    }
}