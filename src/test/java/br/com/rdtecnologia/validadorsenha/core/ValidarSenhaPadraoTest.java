package br.com.rdtecnologia.validadorsenha.core;

import br.com.rdtecnologia.validadorsenha.core.validadores.ValidarSenha;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidarSenhaPadraoTest {

    @Test
    public void senhaValida() {
        String senhaValida = "AbTp9!foo";
        ValidarSenha validadorSenha = new ValidadorSenhaPadrao().criarValidador(senhaValida);
        assertTrue(validadorSenha.senhaValida());
    }

    @Test
    public void senhaInvalida() {
        String senhaInvalida = "AAAbbbCc";
        ValidarSenha validadorSenha = new ValidadorSenhaPadrao().criarValidador(senhaInvalida);
        assertFalse(validadorSenha.senhaValida());
    }

}
