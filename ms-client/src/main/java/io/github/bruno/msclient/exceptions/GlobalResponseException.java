package io.github.bruno.msclient.exceptions;

import java.time.LocalDateTime;

public record GlobalResponseException(
        LocalDateTime localDateTime,
        String message,
        String details
) {
}
