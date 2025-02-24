package com.example.geektrust.exception;

public class DuplicateTopUpException extends RuntimeException {


    public DuplicateTopUpException() {
        super("DUPLICATE_TOPUP");
    }
}
