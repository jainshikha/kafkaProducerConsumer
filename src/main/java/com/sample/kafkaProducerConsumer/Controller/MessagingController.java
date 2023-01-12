package com.sample.kafkaProducerConsumer.Controller;

import com.sample.kafkaProducerConsumer.Service.MessagingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessagingController {

    private static final String TOPIC = "NewTopic";
    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;
    @Autowired
    private MessagingService service;

    @PostMapping("/sendMsgToKafka/{message}")
    public String sendMsgToKafka(@PathVariable("message") final String message) {
        kafkaTemplate.send(TOPIC, message);
        return "Published Successfully";
        /*
         String status = service.sendMsgToKafka();
         return status;*/
    }
}