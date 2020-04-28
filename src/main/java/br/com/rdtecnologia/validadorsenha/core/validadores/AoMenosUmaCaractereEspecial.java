package br.com.rdtecnologia.validadorsenha.core.validadores;

import java.util.regex.Pattern;

public class AoMenosUmaCaractereEspecial extends ValidarSenha {


    public AoMenosUmaCaractereEspecial(String senha) {
        super(senha);
    }

    @Override
    public boolean senhaEValida() {
        Pattern pattern = Pattern.compile("[^A-Za-z0-9]");
        return pattern.matcher(this.senha).find();
    }

}
