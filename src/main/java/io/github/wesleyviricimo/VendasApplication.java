package io.github.wesleyviricimo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan(basePackages = {"io.github.wesleyviricimo.repository","io.github.wesleyviricimo.service" }) //Define quais são as minhas classes de configurações, beans, controllers, repositories e services.
@RestController
public class VendasApplication {


    @Value("${application.name}") //Recuperando o valor a partir do arquivo de configuração externalizado application properties
    private String applicationName;

    @GetMapping("/hello")
    public String helloWorld(){
        return applicationName;
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}
