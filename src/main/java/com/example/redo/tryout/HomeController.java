package com.example.redo.tryout;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.fasterxml.jackson.databind.annotation.JsonTypeResolver;
import jdk.net.SocketFlow;
import org.apache.coyote.Response;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.net.http.HttpResponse;

@RestController
public class HomeController {

    @RequestMapping("/all")
    public ResponseEntity<String> hello() {
        HttpHeaders headers=new HttpHeaders();
        return new ResponseEntity<String>("my status",headers, HttpStatus.CREATED);


    }
}
