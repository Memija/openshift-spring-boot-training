package com.memija.openshift.training.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {
    
    @GetMapping("/healthcheck")
    public ResponseEntity<Boolean> HealthCheck() {
        return new ResponseEntity<Boolean>(true, HttpStatus.OK);
    }

}
