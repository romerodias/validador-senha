package br.com.rdtecnologia.validadorsenha.core.validadores;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AoMenosUmDigitoTest {

    @Test
    public void senhaInvalida() {
        ValidarSenha aoMenosUmDigito = new AoMenosUmDigito("abcde");
        assertFalse(aoMenosUmDigito.senhaEValida());
    }

    @Test
    public void senhaValida() {
        ValidarSenha aoMenosUmDigito = new AoMenosUmDigito("abcd1e2");
        assertTrue(aoMenosUmDigito.senhaEValida());
    }


}
