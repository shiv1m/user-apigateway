package com.apigateway.apigateway;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {
    @GetMapping("/userservicefallback")
    public ResponseEntity<String> userServiceFallBackMethod(){
        return new ResponseEntity<String>("User Service taking longer than expected. " +
                "Please try again later", HttpStatus.OK);
    }

    @GetMapping("/contactservicefallback")
    public ResponseEntity<String> contactServiceFallBackMethod(){
        return new ResponseEntity<String>("Contact Service taking longer than expected. " +
                "Please try again later", HttpStatus.OK);
    }

    @GetMapping("/departmentservicefallback")
    public ResponseEntity<String> departmentServiceFallBackMethod(){
        return new ResponseEntity<String>("Department Service taking longer than expected. " +
                "Please try again later", HttpStatus.OK);
    }
}
