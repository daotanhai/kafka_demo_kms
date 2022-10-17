package com.kms.springapachekafkademo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(topics = "topicKms",
        groupId = "groupIdKms"
    )
    void listener(String data) {
        System.out.println("I have received data: " + data + ":tadaaa ^^");
    }
}
