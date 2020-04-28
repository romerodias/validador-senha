package br.com.rdtecnologia.validadorsenha.core.validadores;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NoveOuMaisCaracteresTest {


    @Test
    public void senhaInvalida() {
        ValidarSenha noveOuMaisDigitos = new NoveOuMaisCaracteres("12345");
        assertFalse(noveOuMaisDigitos.senhaEValida());
    }


    @Test
    public void senhaValida() {
        ValidarSenha noveOuMaisDigitos = new NoveOuMaisCaracteres("123456789");
        assertTrue(noveOuMaisDigitos.senhaEValida());
    }


}
