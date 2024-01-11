package ru.geekbrains.firstHome;

import org.springframework.context.annotation.Bean;

public class ApplicationConfiguration {
    @Bean
    StudentRepository myUserRepository() {
        return new StudentRepository();
    }
}
