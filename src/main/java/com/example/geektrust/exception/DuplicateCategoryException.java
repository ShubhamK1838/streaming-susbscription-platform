package com.example.geektrust.exception;

import java.sql.SQLOutput;

public class DuplicateCategoryException extends RuntimeException {

    public DuplicateCategoryException(String str) {
        super(str);
    }

    public DuplicateCategoryException() {
        super("DUPLICATE_CATEGORY");
    }
}
