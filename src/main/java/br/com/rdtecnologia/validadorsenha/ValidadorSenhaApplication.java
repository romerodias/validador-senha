package br.com.rdtecnologia.validadorsenha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication(scanBasePackages = {"br.com.rdtecnologia"})
public class ValidadorSenhaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ValidadorSenhaApplication.class, args);
    }


}

