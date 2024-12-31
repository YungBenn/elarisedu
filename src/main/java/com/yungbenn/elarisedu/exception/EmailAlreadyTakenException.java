package com.yungbenn.elarisedu.exception;

/**
 * Exception thrown when an attempt is made to register an email that is already taken.
 */
public class EmailAlreadyTakenException extends RuntimeException {
    public EmailAlreadyTakenException() {
        super();
    }
}
