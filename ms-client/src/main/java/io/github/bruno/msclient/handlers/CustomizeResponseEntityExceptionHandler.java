package io.github.bruno.msclient.handlers;

import io.github.bruno.msclient.exceptions.GlobalResponseException;
import io.github.bruno.msclient.exceptions.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@ControllerAdvice
public class CustomizeResponseEntityExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<GlobalResponseException> userNotFound(UserNotFoundException ex, WebRequest request) {
        GlobalResponseException responseException = new GlobalResponseException(LocalDateTime.now(),
                ex.getMessage(), request.getDescription(false));
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(responseException);
    }
}
