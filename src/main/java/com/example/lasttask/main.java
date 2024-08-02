package com.example.lasttask;

import com.example.lasttask.entity.User;
import com.example.lasttask.repository.userRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class main {

    @Bean
    public CommandLineRunner commandLineRunner(userRepository userRepository) {
        return args -> {
            userRepository.save(new User("Merve Kaya", "merve.kaya@example.com",3434305L));
            userRepository.save(new User("Jane Watson", "jane.watson@example.com", 28565776L));
            userRepository.save(new User("Su Ertürk", "su.erturk@example.com", 60365776L));
            System.out.println("Başlangıç verileri eklendi.");
        };
    }
}


