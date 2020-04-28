package br.com.rdtecnologia.validadorsenha.core.validadores;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AoMenosUmaLetraMinusculaTest {


    @Test
    public void senhaInvalida() {
        ValidarSenha aoMenosUmaLetraMinuscula = new AoMenosUmaLetraMinuscula("ABCD");
        assertFalse(aoMenosUmaLetraMinuscula.senhaEValida());
    }


    @Test
    public void senhaValida() {
        ValidarSenha aoMenosUmaLetraMinuscula = new AoMenosUmaLetraMinuscula("ABCd");
        assertTrue(aoMenosUmaLetraMinuscula.senhaEValida());
    }


}
