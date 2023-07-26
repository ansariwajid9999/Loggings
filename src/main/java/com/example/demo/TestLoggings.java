package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestLoggings {
    @GetMapping("/testApi")
    public void function(){
        log.trace("I am the trace log");
        log.debug("I am the debug log");
        log.info("I am the info log");
        log.warn("I am the warning log");
        log.error("I am the error log");
    }
    @GetMapping("/getApi")
    ResponseEntity<String>getApiInfo(){
        return new ResponseEntity<>("This is a String body message", HttpStatus.BAD_GATEWAY);
    }
}
