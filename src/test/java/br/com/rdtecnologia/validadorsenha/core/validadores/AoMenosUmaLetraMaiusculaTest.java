package br.com.rdtecnologia.validadorsenha.core.validadores;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AoMenosUmaLetraMaiusculaTest {

    @Test
    public void senhaInvalida() {
        ValidarSenha aoMenosUmaLetraMaiuscula = new AoMenosUmaLetraMaiuscula("abcd");
        assertFalse(aoMenosUmaLetraMaiuscula.senhaEValida());
    }

    @Test
    public void senhaValida() {
        ValidarSenha aoMenosUmaLetraMaiuscula = new AoMenosUmaLetraMaiuscula("aBcd");
        assertTrue(aoMenosUmaLetraMaiuscula.senhaEValida());
    }

}
