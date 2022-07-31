package com.infy.kafkasample.listeners;

import com.infy.kafkasample.model.Message;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "kafka_topic", groupId = "Kafka",
            containerFactory = "factory")
    void listener(Message message){
        System.out.println("Received: <" + message + "> 🤪");
    }
}
