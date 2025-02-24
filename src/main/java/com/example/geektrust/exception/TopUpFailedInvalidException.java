package com.example.geektrust.exception;

public class TopUpFailedInvalidException extends RuntimeException {
    public TopUpFailedInvalidException() {
        super("ADD_TOPUP_FAILED INVALID_DATE");
    }
    public TopUpFailedInvalidException(String message) {
        super(message);
    }
}
