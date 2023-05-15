package io.github.wesleyviricimo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //Definindo que a classe será apenas de configuração
public class MyConfiguration {

    @Bean(name = "applicationName") //Annotation bean cria o objeto no contexto da aplicação para ser utilizado onde for necessário
    public String applicationName() {
        return "Sistema de Vendas";
    }
}
