package br.com.rdtecnologia.validadorsenha.service;

import br.com.rdtecnologia.validadorsenha.core.ValidarSenhaFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ValidarSenhaService {

    @Autowired
    private ValidarSenhaFactory senhaFactory;

    public boolean validar(String senha) {
        return senhaFactory.criarValidador(senha).senhaValida();
    }

}
