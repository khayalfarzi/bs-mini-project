package az.bs.bsminiproject.controller;

import az.bs.bsminiproject.model.exception.ExceptionDto;
import az.bs.bsminiproject.model.exception.ValidationException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Slf4j
@RestControllerAdvice
public class ErrorHandler extends ResponseEntityExceptionHandler {

    @ResponseStatus(HttpStatus.FORBIDDEN)
    @ExceptionHandler(ValidationException.class)
    public ExceptionDto handleException(ValidationException e) {
        log.error("ActionLog.handleException.error# {}", e.getMessage());
        return new ExceptionDto(e.getMessage());
    }
}