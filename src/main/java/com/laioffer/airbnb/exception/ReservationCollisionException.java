package com.laioffer.airbnb.exception;

public class ReservationCollisionException extends RuntimeException{
    public ReservationCollisionException(String message) {
        super(message);
    }
}
