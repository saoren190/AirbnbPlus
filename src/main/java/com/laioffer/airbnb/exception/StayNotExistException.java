package com.laioffer.airbnb.exception;

public class StayNotExistException extends RuntimeException{
    public StayNotExistException(String message) {
        super(message);
    }
}
