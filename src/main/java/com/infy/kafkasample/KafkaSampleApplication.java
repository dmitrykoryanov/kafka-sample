package com.infy.kafkasample;

import com.infy.kafkasample.model.Message;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

import java.time.LocalDateTime;

@SpringBootApplication
public class KafkaSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaSampleApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(KafkaTemplate<String, Message> kafkaTemplate){
        return args -> {
            kafkaTemplate.send("kafka_topic", new Message("Kafka Sample Message.", LocalDateTime.now()));
        };
    }

}
