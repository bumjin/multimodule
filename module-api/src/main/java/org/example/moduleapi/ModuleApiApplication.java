package org.example.moduleapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication (
        scanBasePackages = {"org.example.moduleapi", "org.example.modulecommon"}
)
@EntityScan("org.example.modulecommon.domain")
@EnableJpaRepositories("org.example.modulecommon.repositories")
public class ModuleApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModuleApiApplication.class, args);
    }

}
