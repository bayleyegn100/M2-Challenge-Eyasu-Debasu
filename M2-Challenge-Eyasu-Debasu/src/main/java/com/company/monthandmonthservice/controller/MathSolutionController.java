package com.company.monthandmonthservice.controller;

import com.company.monthandmonthservice.exception.ZeroIsBadException;
import com.company.monthandmonthservice.models.MathSolution;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class MathSolutionController {
//     Addition
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public MathSolution SumOfTwoNumbers(@RequestBody MathSolution mathSolution){
        mathSolution.setOperation("add");
        mathSolution.setAnswer();
        return mathSolution;
    }
    //     Subtraction
    @RequestMapping(value = "/subtract", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public MathSolution DifferenceOfTwoNumbers(@RequestBody MathSolution mathSolution){
        mathSolution.setOperation("subtract");
        mathSolution.setAnswer();
        return mathSolution;
    }
    //     Multiply
    @RequestMapping(value = "/multiply", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public MathSolution multiplicationOfTwoNumbers(@RequestBody MathSolution mathSolution){
        mathSolution.setOperation("multiply");
        mathSolution.setAnswer();
        return mathSolution;
    }
    //     Division
    @RequestMapping(value = "/divide", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public MathSolution divisionOfTwoNumbers(@RequestBody MathSolution mathSolution){

        mathSolution.setOperation("divide");
        mathSolution.setAnswer();
        return mathSolution;

    }

}
