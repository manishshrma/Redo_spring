package com.example.redo.tryout;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TopicServices {

    @PostConstruct
   public void init()
   {
       System.out.println("init method start.......");
   }

    private List<Topic> mytopics = new ArrayList<>(Arrays.asList());

    public void generatetopics(Topic topic) {
        mytopics.add(topic);
    }

    public List<Topic> getalltopics() {
        return mytopics;
    }

    public Topic gettopicById(String id, HttpServletResponse res) {
        if (mytopics.size() == 0) {
            res.setHeader("Invalid-Length", "Error!!");
            return new Topic(null, null, null);
        }
        List<Topic> topics = mytopics.stream().filter((topic) -> {
            return topic.getId().equals(id);
        }).collect(Collectors.toList());
        return topics.get(0);
    }

    public void updatetopic(String myid, Topic topic) {
        if (topic != null) {
            getalltopics().stream().forEach((t) -> {
                if (t.getId().equals(myid)) {
                    System.out.println(t);
                    mytopics.set(Integer.parseInt(t.getId()), topic);
                }
                else{
                    System.out.println("no index match test");
                }
            });

        } else {
            return;
        }
    }

    public void deletetopic(String delid, Topic topic) {
        if (topic != null) {
            getalltopics().stream().map((t) -> {
                if (t.getId() == delid) {
                    mytopics.remove(Integer.parseInt(delid));
                }
                return null;
            });

        } else
            return;

    }
}
