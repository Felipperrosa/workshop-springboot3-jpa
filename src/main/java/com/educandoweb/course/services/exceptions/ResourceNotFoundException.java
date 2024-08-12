package com.educandoweb.course.services.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

    public static final long serialVersionUID = 1L;

    public  ResourceNotFoundException(Object id){
        super("Resource not found. Id " + id);
    }


}
