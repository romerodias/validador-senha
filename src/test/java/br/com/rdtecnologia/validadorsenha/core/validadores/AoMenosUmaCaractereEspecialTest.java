package br.com.rdtecnologia.validadorsenha.core.validadores;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AoMenosUmaCaractereEspecialTest {

    @Test
    public void senhaInvalida() {
        ValidarSenha aoMenosUmaLetraMaiuscula = new AoMenosUmaCaractereEspecial("abcd");
        assertFalse(aoMenosUmaLetraMaiuscula.senhaEValida());
    }

    @Test
    public void senhaValida() {
        ValidarSenha aoMenosUmaLetraMaiuscula = new AoMenosUmaCaractereEspecial("aBcd!");
        assertTrue(aoMenosUmaLetraMaiuscula.senhaEValida());
    }

}
