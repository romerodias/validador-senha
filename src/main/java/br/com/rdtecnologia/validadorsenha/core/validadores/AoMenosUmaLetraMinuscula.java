package br.com.rdtecnologia.validadorsenha.core.validadores;

import java.util.regex.Pattern;

public class AoMenosUmaLetraMinuscula extends ValidarSenha {


    public AoMenosUmaLetraMinuscula(String senha) {
        super(senha);
    }

    @Override
    public boolean senhaEValida() {
        Pattern pattern = Pattern.compile("[a-z]+");
        return pattern.matcher(this.senha).find();
    }

}
