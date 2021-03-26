package arep.parcial2.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"arep.parcial2"})
public class Parcial2Application {

    public static void main(String[] args) {
        SpringApplication.run(Parcial2Application.class, args);
    }

}
