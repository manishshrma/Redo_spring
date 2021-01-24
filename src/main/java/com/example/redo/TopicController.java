package com.example.redo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Collection;
import java.util.Collections;
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

    @RequestMapping(method = RequestMethod.POST, value = "/addtopic")
    public String addtopic(@RequestBody Topic topic, HttpServletRequest req, HttpServletResponse res) throws IOException {
        topicServices.generatetopics(topic);

        // can set ur own headers
        res.setHeader("ACCEPTED", "success!!");
        res.setDateHeader("Curr_time", 1742);
        res.setHeader("useless", "Test");
        res.setStatus(203);
        // traverse all headers names
//        Collection<String> result = res.getHeaderNames();
//        List<String> list = result.stream().collect(Collectors.toList());
//        System.out.println(list);
//        byte arr[] = req.getInputStream().readAllBytes();
//        String str=req.getReader().readLine();// can't do as @Requestbody already did that internally
//        for (byte x : arr) {
//            char ch = (char) (x & 0xFF);
//            System.out.print(ch);
//        }
        return req.getContextPath();
    }

    // get topics by id
    @RequestMapping(method = RequestMethod.GET, value = "/topic/{id}")
    public void topicbyId(@PathVariable String id) {
        topicServices.gettopicById(id);
    }
}
