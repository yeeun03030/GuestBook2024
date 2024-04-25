package kr.ac.kopo.guestbook2024;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class GuestBook2024Application {

    public static void main(String[] args) {
        SpringApplication.run(GuestBook2024Application.class, args);
    }

}
