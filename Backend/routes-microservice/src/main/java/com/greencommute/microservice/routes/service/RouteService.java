package com.greencommute.microservice.routes.service;

import com.greencommute.microservice.routes.entity.*;

import java.util.List;

public interface RouteService {

    public List<Route> getRoutes();

    public Route getRoute(int theId);
}
