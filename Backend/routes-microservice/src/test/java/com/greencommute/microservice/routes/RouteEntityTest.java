package com.greencommute.microservice.routes;

import com.greencommute.microservice.routes.entity.Route;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class RouteEntityTest {

    @Test
    void setIdTest(){
        Route route1 = new Route(1,"Bike");
        route1.setRouteId(10);
        assertEquals(10,route1.getRouteId());
    }

    @Test
    void setRouteName() {
        Route route1 = new Route(1,"Bike");
        route1.setRouteName("Train");
        assertEquals("Train",route1.getRouteName());
    }

}
