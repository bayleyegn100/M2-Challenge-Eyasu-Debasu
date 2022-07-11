package com.company.monthandmonthservice.controller;

import com.company.monthandmonthservice.models.MathSolution;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class) // tests the spring application
@WebMvcTest(MathSolutionController.class) // It runs a test at MonthController
public class MathSolutionControllerTest {

    @Autowired
    private MockMvc mockMVC;

    private ObjectMapper mapper = new ObjectMapper();

    @Test // For adding two numbers

    public void shouldAddTwoNumbers() throws Exception {
        MathSolution inputRecord = new MathSolution();
        inputRecord.setOperand1(13.23);
        inputRecord.setOperand2(15.45);
        inputRecord.setOperation("add");

        MathSolution outputRecord = new MathSolution();
        outputRecord.setOperand1(13.23);
        outputRecord.setOperand2(15.45);
        outputRecord.setOperation("add");
        outputRecord.setAnswer();

        String inputJson = mapper.writeValueAsString(inputRecord);
        String outputJson = mapper.writeValueAsString(outputRecord);

        mockMVC.perform(post("/add")
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().json(outputJson));
    }

    @Test // For subtracting two numbers

    public void shouldSubtractTwoNumbers () throws Exception {
        MathSolution inputRecord = new MathSolution();
        inputRecord.setOperand1(210);
        inputRecord.setOperand2(100);
        inputRecord.setOperation("subtract");

        MathSolution outputRecord = new MathSolution();
        outputRecord.setOperand1(210);
        outputRecord.setOperand2(100);
        outputRecord.setOperation("subtract");
        outputRecord.setAnswer();

        String inputJson = mapper.writeValueAsString(inputRecord);
        String outputJson = mapper.writeValueAsString(outputRecord);

        mockMVC.perform(post("/subtract")
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().json(outputJson));


    }

    @Test // For multiply two numbers

    public void shouldMultiplyTwoNumbers () throws Exception {
        MathSolution inputRecord = new MathSolution();
        inputRecord.setOperand1(10);
        inputRecord.setOperand2(12);
        inputRecord.setOperation("multiply");

        MathSolution outputRecord = new MathSolution();
        outputRecord.setOperand1(10);
        outputRecord.setOperand2(12);
        outputRecord.setOperation("multiply");
        outputRecord.setAnswer();

        String inputJson = mapper.writeValueAsString(inputRecord);
        String outputJson = mapper.writeValueAsString(outputRecord);

        mockMVC.perform(post("/multiply")
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().json(outputJson));


    }

    @Test // For multiply two numbers

    public void shouldDivideTwoNumbers () throws Exception {
        MathSolution inputRecord = new MathSolution();
        inputRecord.setOperand1(50);
        inputRecord.setOperand2(75);
        inputRecord.setOperation("divide");

        MathSolution outputRecord = new MathSolution();
        outputRecord.setOperand1(50);
        outputRecord.setOperand2(75);
        outputRecord.setOperation("divide");
        outputRecord.setAnswer();

        String inputJson = mapper.writeValueAsString(inputRecord);
        String outputJson = mapper.writeValueAsString(outputRecord);

        mockMVC.perform(post("/divide")
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().json(outputJson));


    }



}