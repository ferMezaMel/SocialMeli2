package com.meli.socialmeli.exception.custom;

public class NotFoundException extends  RuntimeException{
    public NotFoundException(String message) {
        super(message);
    }
}
