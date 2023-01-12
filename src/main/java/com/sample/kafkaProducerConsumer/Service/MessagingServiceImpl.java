package com.sample.kafkaProducerConsumer.Service;

import org.springframework.stereotype.Service;

@Service
public class MessagingServiceImpl implements MessagingService {
    public String sendMsgToKafka() {
        return "Mail Msg Successfully";

    }
}