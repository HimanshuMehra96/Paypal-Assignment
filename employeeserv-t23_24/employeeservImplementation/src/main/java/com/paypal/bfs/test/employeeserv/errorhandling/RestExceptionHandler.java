package com.paypal.bfs.test.employeeserv.errorhandling;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler{

	//handler for Argument mismatch in API calls
	@ExceptionHandler({ MethodArgumentTypeMismatchException.class })
	public ResponseEntity<Object> handleMethodArgumentTypeMismatch(
	  MethodArgumentTypeMismatchException ex, WebRequest request) {
	    String error = 
	      ex.getName() + " should be of type " + ex.getRequiredType().getName();

	    ApiError apiError = 
	      new ApiError(HttpStatus.BAD_REQUEST, ex.getLocalizedMessage(), error);
	    return new ResponseEntity<Object>(
	      apiError, apiError.getStatus());
	}

	//handler for NoSuchElementException
	//exception occurs when a non existent element is queried
	@ExceptionHandler(NoSuchElementException.class)
	protected ResponseEntity<Object> handleElementNotFound(
	  NoSuchElementException ex) {
		String error = ex.toString();
		ApiError apiError = new ApiError(HttpStatus.NOT_FOUND,ex.getMessage(),error);
		apiError.setMessage(ex.getMessage());
		return new ResponseEntity<Object>(
		  apiError, apiError.getStatus());
	}

	//handler for valid arguments in request body
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(
	  MethodArgumentNotValidException ex, 
	  HttpHeaders headers, 
	  HttpStatus status, 
	  WebRequest request) {
	    List<String> errors = new ArrayList<String>();
	    for (FieldError error : ex.getBindingResult().getFieldErrors()) {
	        errors.add(error.getField() + ": " + error.getDefaultMessage());
	    }
	    for (ObjectError error : ex.getBindingResult().getGlobalErrors()) {
	        errors.add(error.getObjectName() + ": " + error.getDefaultMessage());
	    }
	    
	    ApiError apiError = 
	      new ApiError(HttpStatus.BAD_REQUEST, ex.getLocalizedMessage(), errors);
	    return handleExceptionInternal(
	      ex, apiError, headers, apiError.getStatus(), request);
	}

	//request body not correctly formed
	//type of field incorrect error 
	@Override
   protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
       String error = "Malformed JSON request";
       ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST, error, ex.toString());
       return new ResponseEntity<Object>(apiError, apiError.getStatus());
   }
	
	//default handler
	@ExceptionHandler({ Exception.class })
	public ResponseEntity<Object> handleAll(Exception ex, WebRequest request) {
	    ApiError apiError = new ApiError(
	      HttpStatus.INTERNAL_SERVER_ERROR, ex.getLocalizedMessage(), "error occurred");
	    return new ResponseEntity<Object>(
	      apiError, apiError.getStatus());
	}
}
