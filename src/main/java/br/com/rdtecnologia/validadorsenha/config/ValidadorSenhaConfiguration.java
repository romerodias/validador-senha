package br.com.rdtecnologia.validadorsenha.config;

import br.com.rdtecnologia.validadorsenha.core.ValidadorSenhaPadrao;
import br.com.rdtecnologia.validadorsenha.core.ValidarSenhaFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ValidadorSenhaConfiguration {

    /**
     * Bean criado como adapter para desacoplar o spring framework das classes de domínio
     * @return ValidarSenhaFactory
     */
    @Bean
    public ValidarSenhaFactory validarSenhaFactory() {
        return new ValidadorSenhaPadrao();
    }
}
