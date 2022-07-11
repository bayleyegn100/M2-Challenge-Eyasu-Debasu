package com.company.monthandmonthservice.controller;

import com.company.monthandmonthservice.models.MathSolution;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class MathSolutionController {

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public MathSolution findSumOfTwoIntegers(@RequestBody MathSolution mathSolution){
        mathSolution.setOperation("add");
        mathSolution.setAnswer();
        return mathSolution;
    }
}
