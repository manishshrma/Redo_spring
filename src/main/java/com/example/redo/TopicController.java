package com.example.redo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Enumeration;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class TopicController {

    @Autowired
    private TopicServices topicServices;


    // get all topics
    @RequestMapping("/getTopics")
    public List<Topic> getalltopics() {
        return topicServices.getalltopics();
    }


//    @RequestMapping(method = RequestMethod.POST,value = "/addtopic")
//    public ResponseEntity<String> addtopic(HttpServletRequest req) throws IOException {
//
//        // body data
//        String data = req.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
//
//        String topic = req.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
//
//        System.out.println(topic);
//
//        HttpHeaders headers=new HttpHeaders();
//        headers.set("myheaders","myvalue");
//
////        topicServices.generatetopics(data);
//        return new ResponseEntity<>(data,headers, HttpStatus.ACCEPTED);
//    }

    // get topics by id
    @RequestMapping(method = RequestMethod.GET,value = "/topic/{id}")
    public void topicbyId(@PathVariable String id)
    {
          topicServices.gettopicById(id);
    }
}
