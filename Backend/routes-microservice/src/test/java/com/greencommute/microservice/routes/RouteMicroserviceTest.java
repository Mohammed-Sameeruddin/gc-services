package com.greencommute.microservice.routes;

import com.greencommute.microservice.RoutesMicroserviceApplication;
import com.greencommute.microservice.routes.service.RouteService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RouteMicroserviceTest {

    @Autowired
    private RouteService routeService;

    @Test
    void applicationContextTest() {
        RoutesMicroserviceApplication.main(new String[] {});
        Assertions.assertNotNull(routeService);
    }


}
