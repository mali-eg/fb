package com.fp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(value=HttpStatus.UNAUTHORIZED, reason="Invalid Credentials")
public class InvalidCredentialsException extends RuntimeException {

}
