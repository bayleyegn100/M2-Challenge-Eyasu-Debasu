package com.company.monthandmonthservice.controller;

import com.company.monthandmonthservice.models.Months;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Arrays;
import java.util.List;

@RestController
public class MonthController {
//    private List<Months> listOfMonths = Arrays.asList(
//            new Months(1, "January"),
//            new Months(2, "February"),
//            new Months(3, "March"),
//            new Months(4, "April"),
//            new Months(5, "May"),
//            new Months(6, "June"),
//            new Months(7, "July"),
//            new Months(8, "August"),
//            new Months(9, "September"),
//            new Months(10, "October"),
//            new Months(11, "November"),
//            new Months(12, "December")
//    );

    @RequestMapping(value = "/month/{monthNumber}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String getCorrespondingMonthAndNumber(@PathVariable int monthNumber) {
        if (monthNumber == 1) {
            return "1- January";
        } else if (monthNumber == 2) {
            return "2- February";
        } else if (monthNumber == 3) {
            return "3- March";
        } else if (monthNumber == 4) {
            return "4- April";
        } else if (monthNumber == 5) {
            return "5- May";
        } else if (monthNumber == 6) {
            return "6- June";
        } else if (monthNumber == 7) {
            return "7- July";
        } else if (monthNumber == 8) {
            return "8- August";
        } else if (monthNumber == 9) {
            return "9- September";
        } else if (monthNumber == 10) {
            return "10- October";
        } else if (monthNumber == 11) {
            return "11- November";
        } else if (monthNumber == 12){
            return "12- December";
        } else {
            throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY, "Invalid Month Number entered. Enter a number between 1 and 12 inclusive.");
    }
    }

//    @RequestMapping(value = "/month/{monthNumber}", method = RequestMethod.GET)
//    @ResponseStatus(HttpStatus.OK)
//    public Months getMonthByNumber(@PathVariable int monthNumber) {
//        Months output = null;
//        for (Months month : listOfMonths) {
//            if (month.getMonthNumber() == monthNumber) {
//                output = month;
//            }
//        }
//        return output;
//    }
}
