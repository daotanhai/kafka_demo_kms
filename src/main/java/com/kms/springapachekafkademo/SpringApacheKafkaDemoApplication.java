package com.kms.springapachekafkademo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;
import sun.tools.jar.CommandLine;

@SpringBootApplication
public class SpringApacheKafkaDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringApacheKafkaDemoApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate) {
        return args -> {
            for (int i = 0 ; i< 100; i++) {
                kafkaTemplate.send("topicKms", "i'm a publisher" + i);
            }
        };
    }

}
