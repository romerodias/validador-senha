package br.com.rdtecnologia.validadorsenha.core.validadores;

import java.util.regex.Pattern;

public class AoMenosUmaLetraMaiuscula extends ValidarSenha {


    public AoMenosUmaLetraMaiuscula(String senha) {
        super(senha);
    }

    @Override
    public boolean senhaEValida() {
        Pattern pattern = Pattern.compile("[A-Z]+");
        return pattern.matcher(this.senha).find();
    }

}
