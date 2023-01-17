package com.greencommute.microservice.routes;

import com.greencommute.microservice.routes.exceptions.RouteErrorResponse;
import com.greencommute.microservice.routes.service.RouteService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class RouteExceptionTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private RouteService routeService;

    @Test
    void badRequestException() throws Exception{
        Mockito.when(routeService.getRoutes()).thenThrow(new NullPointerException());

        mockMvc.perform(get("/routes")).andExpect(status().isBadRequest());
    }

    @Test
    void notFoundException() throws Exception {
        Mockito.when(routeService.getRoutes()).thenThrow(new NullPointerException());
        mockMvc.perform(get("/routes/5")).andExpect(status().isNotFound());
    }

    @Test
    void setterTest() throws Exception {
        RouteErrorResponse error = new RouteErrorResponse();

        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage("NOT FOUND");
        error.setTimeStamp(System.currentTimeMillis());

        RouteErrorResponse error1 = new RouteErrorResponse(
                HttpStatus.NOT_FOUND.value(), "NOT FOUND",System.currentTimeMillis());

        assertEquals(error1.getStatus(),error.getStatus());
        assertEquals(error1.getMessage(),error.getMessage());
        assertEquals(error1.getTimeStamp(),error.getTimeStamp());
    }


}
