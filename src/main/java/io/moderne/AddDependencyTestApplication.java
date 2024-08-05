package io.moderne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AddDependencyTestApplication {

    public static void main(String[] args) {
        com.shaded.checkerframework.bla.Type type = new com.shaded.checkerframework.bla.Type();
        SpringApplication.run(AddDependencyTestApplication.class, args);
    }

}
