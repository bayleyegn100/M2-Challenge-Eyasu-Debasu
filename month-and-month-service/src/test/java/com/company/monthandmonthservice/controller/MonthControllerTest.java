package com.company.monthandmonthservice.controller;

import com.company.monthandmonthservice.controller.MonthController;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;//import get static method
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class) // tests the spring application
@WebMvcTest(MonthController.class) // It runs a test at MonthController

public class MonthControllerTest {
    @Autowired //
    private MockMvc mockMvc;

    private  ObjectMapper mapper = new ObjectMapper();

    @Test
    public void shouldReturnMonthOWithCorrespondingNumber() throws Exception { //a jackson mapper has exception
        String outputJson = "9 - September";

        mockMvc.perform(
                        get("/month/9")
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(outputJson));
    }

//    MOCKMVC test for random month selector
     @Test
     public void ShouldReturnARandomMonthFromFromListOfMonthsRecord() throws Exception {
        mockMvc.perform(get("/monthNumber"))
                .andDo(print())
                .andExpect(status().isOk());
     }

    @Test
    public void shouldReturn422ForInvalidMonthNumber() throws Exception {
        mockMvc.perform(
                        get("/month/13")
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

}