package br.edu.senaisp.Aula18_31_03_25.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<?> geralRuntimeException(RecursoNotFound e, WebRequest request) {
		MensagemErro msg = new MensagemErro(LocalDateTime.now(), e.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(msg, HttpStatus.INTERNAL_SERVER_ERROR);

	}

}
