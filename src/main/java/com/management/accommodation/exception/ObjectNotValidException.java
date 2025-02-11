package com.management.accommodation.exception;

import lombok.Data;

import java.util.Set;

@Data
public class ObjectNotValidException extends RuntimeException{
    private final Set<String> errorMsg;
}
