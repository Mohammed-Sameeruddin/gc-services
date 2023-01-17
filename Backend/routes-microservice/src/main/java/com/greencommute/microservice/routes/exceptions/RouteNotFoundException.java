package com.greencommute.microservice.routes.exceptions;

public class RouteNotFoundException extends RuntimeException {

    public RouteNotFoundException(String message) {
        super(message);
    }

}
