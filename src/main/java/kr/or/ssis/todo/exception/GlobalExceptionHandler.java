package kr.or.ssis.todo.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLSyntaxErrorException;

@ControllerAdvice
@RestController
public class GlobalExceptionHandler {

    @ExceptionHandler(value = SQLSyntaxErrorException.class)
    public String handleSSEException(SQLSyntaxErrorException e) {
        return "SQL 문법이 잘못되었습니다.";
    }


}
