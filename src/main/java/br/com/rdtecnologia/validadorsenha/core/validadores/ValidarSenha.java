package br.com.rdtecnologia.validadorsenha.core.validadores;

public abstract class ValidarSenha {

    public ValidarSenha(String senha) {
        this.senha = senha;
    }

    protected ValidarSenha proximoValidador;
    protected String senha;
    public abstract boolean senhaEValida();

    public void setarProximoValidador(ValidarSenha proximo) {
        this.proximoValidador = proximo;
    }

    public boolean senhaValida() {
        boolean senhaValida = true;

        if(senhaEValida() == false) {
            return false;
        } else if (proximoValidador != null) {
            senhaValida = this.proximoValidador.senhaValida();
        }

        return senhaValida;
    }

}
