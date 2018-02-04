package br.com.emiron.springrestfulldemo.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.com.emiron.springrestfulldemo.exception.NotFoundException;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler{

     @ExceptionHandler(value = NullPointerException.class)
     protected ResponseEntity<Object> nullPointer(RuntimeException ex, WebRequest request){
          String bodyOfResponse = "Internal Server Error";
          return this.handleExceptionInternal(ex, bodyOfResponse, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR,
                    request);
     }

     @ExceptionHandler(value = NotFoundException.class)
     protected ResponseEntity<Object> notFound(RuntimeException ex, WebRequest request){
          String bodyOfResponse = "The Resource was not found";
          return this.handleExceptionInternal(ex, bodyOfResponse, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR,
                    request);
     }

}
