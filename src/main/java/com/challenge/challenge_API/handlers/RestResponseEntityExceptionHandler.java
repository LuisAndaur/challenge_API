package com.challenge.challenge_API.handlers;

import com.challenge.challenge_API.exceptions.ResourceNotFoundException;
import org.apache.coyote.BadRequestException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(RestResponseEntityExceptionHandler.class);

    @ExceptionHandler(BadRequestException.class)
    protected ResponseEntity<Object> handleBadRequest(RuntimeException ex, WebRequest request){
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "La operación realizada no es válida.");
        body.put("Error", HttpStatus.BAD_REQUEST.toString());

        logger.error("ERROR BAD REQUEST => ".concat(ex.getMessage()));
        return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    protected ResponseEntity<Object> handleNotFound(RuntimeException ex, WebRequest request){
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "No se encontró el dato.");
        body.put("Error", HttpStatus.NOT_FOUND.toString());

        logger.error("ERROR NOT FOUND => ".concat(ex.getMessage()));
        return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(SQLException.class)
    protected ResponseEntity<Object> handleSQL(RuntimeException ex, WebRequest request){
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "Ocurrió un error al intentar acceder a la base de datos.");
        body.put("Error", HttpStatus.INTERNAL_SERVER_ERROR.toString());

        logger.error("ERROR BASE DE DATOS => ".concat(ex.getMessage()));
        return new ResponseEntity<>(body, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(InternalError.class)
    protected ResponseEntity<Object> handleInternalServer(RuntimeException ex, WebRequest request){
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "Ocurrió un error interno en el servidor.");
        body.put("Error", HttpStatus.INTERNAL_SERVER_ERROR.toString());

        logger.error("ERROR INESPERADO => ".concat(ex.getMessage()));
        return new ResponseEntity<>(body, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
