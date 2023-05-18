package io.github.wesleyviricimo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Development
public class MyConfiguration {

    @Bean
    public CommandLineRunner executar(){//Quando a aplicação é iniciada todos os beans com o método commandoLineRunner  são executados primeiro
        return args -> {
            System.out.println("RODANDO EM DESENVOLVIMENTO");
        };
    }
}
