package com.yungbenn.elarisedu.exception;

/**
 * Exception thrown when a requested resource is not found.
 */
public class ResourceNotFound extends RuntimeException {
    public ResourceNotFound(String message) {
        super(message);
    }
}
