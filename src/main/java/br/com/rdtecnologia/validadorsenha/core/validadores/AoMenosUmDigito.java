package br.com.rdtecnologia.validadorsenha.core.validadores;

import java.util.regex.Pattern;

public class AoMenosUmDigito extends ValidarSenha {


    public AoMenosUmDigito(String senha) {
        super(senha);
    }

    @Override
    public boolean senhaEValida() {
        Pattern pattern = Pattern.compile("\\d+");
        return pattern.matcher(this.senha).find();
    }

}
