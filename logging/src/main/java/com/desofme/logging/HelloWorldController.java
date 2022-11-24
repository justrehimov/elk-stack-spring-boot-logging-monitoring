package com.desofme.logging;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/")
@Log4j2
public class HelloWorldController {

    @GetMapping
    public void helloWorld() {
        LocalDateTime localDateTime = LocalDateTime.now();
        log.info("Welcome home controller : {}", localDateTime);

    }

    @GetMapping("/logs")
    public String logs() {
        LocalDateTime localDateTime = LocalDateTime.now();
        log.info("All logs are these : {}", localDateTime);
        return "Logs1,Logs2,Logs3";
    }

    @GetMapping("/err")
    public String err() {
        log.error("Error occur : {}", IllegalArgumentException::new);
        return "Error man!";
    }
}
