package br.com.rdtecnologia.validadorsenha.core.validadores;

public class NoveOuMaisCaracteres extends ValidarSenha {


    public NoveOuMaisCaracteres(String senha) {
        super(senha);
    }

    @Override
    public boolean senhaEValida() {
        return this.senha.length() >= 9;
    }

}
