package com.example.geektrust.exception;

import java.sql.SQLOutput;

public class InvalidDateException extends RuntimeException {

    public InvalidDateException(String message) {
        super(message);
    }


    public InvalidDateException() {
        super("INVALID_DATE");
    }
}
