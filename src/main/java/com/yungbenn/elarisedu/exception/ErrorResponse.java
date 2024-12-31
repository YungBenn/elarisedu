package com.yungbenn.elarisedu.exception;

import java.util.Map;

/**
 * A record that represents an error response.
 *
 * @param message     The error message.
 * @param error       The error type or code.
 * @param status      The HTTP status code.
 * @param fieldErrors A map of field-specific error messages.
 */
public record ErrorResponse(
        String message,
        String error,
        int status,
        Map<String, String> fieldErrors) {
}
