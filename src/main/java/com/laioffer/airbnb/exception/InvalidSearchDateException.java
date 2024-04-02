package com.laioffer.airbnb.exception;

public class InvalidSearchDateException extends RuntimeException{
    public InvalidSearchDateException(String message) {
        super(message);
    }
}
