package com.mycompany.wotd.wotd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WotdApplication {

    public static void main(String[] args) {
        SpringApplication.run(WotdApplication.class, args);
    }

    @RequestMapping(value = "/word", method = RequestMethod.GET)
    public ResponseEntity<String> getWordOfTheDay(){
        return ResponseEntity.ok("Brilliant");
    }
}
