package com.company.monthandmonthservice.controller;

import com.company.monthandmonthservice.exception.ZeroIsBadException;
import com.company.monthandmonthservice.models.CustomeErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class ControllerExceptionHandler {
    @ExceptionHandler(value = {IllegalArgumentException.class})
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public ResponseEntity<CustomeErrorResponse> handleOutOfRange(IllegalArgumentException e) {
        CustomeErrorResponse error = new CustomeErrorResponse(HttpStatus.UNPROCESSABLE_ENTITY.toString(), e.getMessage());
        error.setTimestamp(LocalDateTime.now());
        error.setStatus(HttpStatus.UNPROCESSABLE_ENTITY.value());
        ResponseEntity<CustomeErrorResponse> responseEntity = new ResponseEntity<>(error, HttpStatus.UNPROCESSABLE_ENTITY);
        return responseEntity;
    }

//    @ExceptionHandler(value = {IndexOutOfBoundsException.class})
//    @ResponseStatus(HttpStatus.MOVED_PERMANENTLY)
//    public ResponseEntity<CustomeErrorResponse> handleIndexOutOfBounds(IndexOutOfBoundsException e) {
//        CustomeErrorResponse error = new CustomeErrorResponse(HttpStatus.MOVED_PERMANENTLY.toString(), e.getMessage());
//        error.setTimestamp(LocalDateTime.now());
//        error.setStatus(HttpStatus.MOVED_PERMANENTLY.value());
//        ResponseEntity<CustomeErrorResponse> responseEntity = new ResponseEntity<>(error, HttpStatus.MOVED_PERMANENTLY);
//        return responseEntity;
//    }
//
//    @ExceptionHandler(value = {ZeroIsBadException.class})
//    @ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
//    public ResponseEntity<CustomeErrorResponse> handleZeroException(ZeroIsBadException e) {
//        CustomeErrorResponse error = new CustomeErrorResponse(HttpStatus.I_AM_A_TEAPOT.toString(), e.getMessage());
//        error.setTimestamp(LocalDateTime.now());
//        error.setStatus(HttpStatus.I_AM_A_TEAPOT.value());
//        ResponseEntity<CustomeErrorResponse> responseEntity = new ResponseEntity<>(error, HttpStatus.I_AM_A_TEAPOT);
//        return responseEntity;
//    }
}