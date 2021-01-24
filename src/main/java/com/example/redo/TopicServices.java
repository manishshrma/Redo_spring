package com.example.redo;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TopicServices {

   private List<Topic> mytopics=new ArrayList<>(Arrays.asList(
           new Topic("12","abc","dd"),
           new Topic("13","acd","ee"),
           new Topic("14","cvb","aa")
   ));

    public void generatetopics(Topic topic) {
        mytopics.add(topic);
    }

    public List<Topic> getalltopics() {
        return mytopics;
    }

    public Topic gettopicById(String id) {

    List<Topic> topics= mytopics.stream().filter((topic)->{

            return topic.getId()==id;

        }).collect(Collectors.toList());

    return topics.get(0);

    }
}
