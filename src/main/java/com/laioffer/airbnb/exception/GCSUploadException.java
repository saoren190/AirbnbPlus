package com.laioffer.airbnb.exception;

public class GCSUploadException extends RuntimeException{
    public GCSUploadException(String message) {
        super(message);
    }
}
