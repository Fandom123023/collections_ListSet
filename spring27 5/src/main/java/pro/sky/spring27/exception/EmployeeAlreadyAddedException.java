package pro.sky.spring27.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
public class EmployeeAlreadyAddedException extends RuntimeException {

    public EmployeeAlreadyAddedException(String message) {
        super(message);

        }

    }



