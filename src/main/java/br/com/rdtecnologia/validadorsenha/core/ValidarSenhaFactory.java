package br.com.rdtecnologia.validadorsenha.core;

import br.com.rdtecnologia.validadorsenha.core.validadores.ValidarSenha;

public interface ValidarSenhaFactory {
    ValidarSenha criarValidador(String senha);
}
