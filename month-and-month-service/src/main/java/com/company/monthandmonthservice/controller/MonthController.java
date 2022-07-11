package com.company.monthandmonthservice.controller;

import com.company.monthandmonthservice.models.Months;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class MonthController {
    private static List<Months> listOfMonths = Arrays.asList(
            new Months(1, "January"),
            new Months(2, "February"),
            new Months(3, "March"),
            new Months(4, "April"),
            new Months(5, "May"),
            new Months(6, "June"),
            new Months(7, "July"),
            new Months(8, "August"),
            new Months(9, "September"),
            new Months(10, "October"),
            new Months(11, "November"),
            new Months(12, "December")
    );

//    Month convertor
    @RequestMapping(value = "/month/{monthNumber}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String getCorrespondingMonthAndNumber(@PathVariable int monthNumber) {
//        for( int i = 0; i < listOfMonths.size(); i++){
//            if(monthNumber == i+1){
//                return  monthNumber + " - " + listOfMonths.get(i).getMonthInString();
//            } else {
//                throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY, "Invalid Month Number entered. Enter a number between 1 and 12 inclusive.");
//            }
//        }

        if (monthNumber == 1) {
            return monthNumber + " - " + listOfMonths.get(0).getMonthInString();
        } else if (monthNumber == 2) {
           return monthNumber + " - " + listOfMonths.get(1).getMonthInString();
        } else if (monthNumber == 3) {
           return monthNumber + " - " + listOfMonths.get(2).getMonthInString();
        } else if (monthNumber == 4) {
           return monthNumber + " - " + listOfMonths.get(3).getMonthInString();
        } else if (monthNumber == 5) {
           return monthNumber + " - " + listOfMonths.get(4).getMonthInString();
        } else if (monthNumber == 6) {
           return monthNumber + " - " + listOfMonths.get(5).getMonthInString();
        } else if (monthNumber == 7) {
           return monthNumber + " - " + listOfMonths.get(6).getMonthInString();
        } else if (monthNumber == 8) {
           return monthNumber + " - " + listOfMonths.get(7).getMonthInString();
        } else if (monthNumber == 9) {
           return monthNumber + " - " + listOfMonths.get(8).getMonthInString();
        } else if (monthNumber == 10) {
          return  monthNumber + " - " + listOfMonths.get(9).getMonthInString();
        } else if (monthNumber == 11) {
          return  monthNumber + " - " + listOfMonths.get(10).getMonthInString();
        } else if (monthNumber == 12){
           return monthNumber + " - " + listOfMonths.get(11).getMonthInString();
        } else {
            throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY, "Invalid Month Number entered. Enter a number between 1 and 12 inclusive.");
    }


    }
//    Random month selector
    @RequestMapping(value = "/monthNumber", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String getARandomMonthInString() {
        Random random = new Random();
        int randomMonthInString = random.nextInt(listOfMonths.size());
        return listOfMonths.get(randomMonthInString).getMonthInString();


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
