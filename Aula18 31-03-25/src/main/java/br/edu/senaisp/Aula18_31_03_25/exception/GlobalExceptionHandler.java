package br.edu.senaisp.Aula18_31_03_25.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(RecursoNotFound.class)
	public ResponseEntity<?> recursoNotFound(RecursoNotFound e, WebRequest request) {
		
		return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
		
	}
	
}
