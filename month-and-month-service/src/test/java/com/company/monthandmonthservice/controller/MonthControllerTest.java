package com.company.monthandmonthservice.controller;

import com.company.monthandmonthservice.controller.MonthController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(MonthController.class)

public class MonthControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnMonthOWithCorrespondingNumber() throws Exception {
        String outputJson = "9- September";

        mockMvc.perform(
                        get("/month/9")
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(outputJson));
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