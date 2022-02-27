package az.unibank.ms.fintech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;

@SpringBootApplication(exclude = {UserDetailsServiceAutoConfiguration.class })
public class FintechMsApplication {

    public static void main(String[] args) {

        SpringApplication.run(FintechMsApplication.class, args);
    }

}
