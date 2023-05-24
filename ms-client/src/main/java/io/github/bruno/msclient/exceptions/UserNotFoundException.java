package io.github.bruno.msclient.exceptions;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException() {
        super("User Not Found");
    }
}
