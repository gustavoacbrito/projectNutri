package iza.nutrition.projectNutri.exception.exceptionHandler;


import iza.nutrition.projectNutri.exception.BusinessRulesException;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@ControllerAdvice
public class ApiExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<Object> handleConstraintViolationException(ConstraintViolationException ex, WebRequest request) {
        ErrorInfo errorInfo = new ErrorInfo();
        List<ErrorInfo.Campo> campos = new ArrayList<>();

        for (ConstraintViolation<?> violation : ex.getConstraintViolations()) {
            String nome = violation.getPropertyPath().toString();
            String mensagem = violation.getMessage();
            campos.add(new ErrorInfo.Campo(nome, mensagem));
        }
        var status = HttpStatus.BAD_REQUEST;
        errorInfo.setStatus(status.value());
        errorInfo.setDataHora(OffsetDateTime.now());
        errorInfo.setTitulo("Um ou mais campos estão inválidos. Faça o preenchimento correto e tente novamente");
        errorInfo.setCampos(campos);

        return handleExceptionInternal(ex, errorInfo, new HttpHeaders(), status, request);
    }

    @ExceptionHandler(BusinessRulesException.class)
    public ResponseEntity<Object> handleBusinessRulesException(BusinessRulesException ex, WebRequest request) {
        var status = HttpStatus.BAD_REQUEST;
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setTitulo(ex.getMessage());
        errorInfo.setStatus(status.value());
        errorInfo.setDataHora(OffsetDateTime.now());
        return handleExceptionInternal(ex, errorInfo, new HttpHeaders(), status, request);
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<Object> handleNoSuchElementException(NoSuchElementException ex, WebRequest request) {
        var status = HttpStatus.NOT_FOUND;
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setTitulo(ex.getMessage());
        errorInfo.setStatus(status.value());
        errorInfo.setDataHora(OffsetDateTime.now());
        return handleExceptionInternal(ex, errorInfo, new HttpHeaders(), status, request);
    }

}
