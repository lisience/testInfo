package com.ls.test;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @GetMapping("/test")
    public HttpEntity<String> testInfo() {
        return new ResponseEntity<>("test success", HttpStatus.OK);
    }
}
