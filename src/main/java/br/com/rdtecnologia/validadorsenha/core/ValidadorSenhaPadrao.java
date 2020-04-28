package br.com.rdtecnologia.validadorsenha.core;

import br.com.rdtecnologia.validadorsenha.core.validadores.*;

public class ValidadorSenhaPadrao implements ValidarSenhaFactory {

    @Override
    public ValidarSenha criarValidador(String senha) {
        NoveOuMaisCaracteres noveOuMaisCaracteres = new NoveOuMaisCaracteres(senha);
        AoMenosUmDigito aoMenosUmDigito = new AoMenosUmDigito(senha);
        AoMenosUmaLetraMaiuscula aoMenosUmaLetraMaiuscula = new AoMenosUmaLetraMaiuscula(senha);
        AoMenosUmaLetraMinuscula aoMenosUmaLetraMinuscula = new AoMenosUmaLetraMinuscula(senha);
        ValidarSenha aoMenosUmCaractereEspecial = new AoMenosUmaCaractereEspecial(senha);

        noveOuMaisCaracteres.setarProximoValidador(aoMenosUmDigito);
        aoMenosUmDigito.setarProximoValidador(aoMenosUmaLetraMaiuscula);
        aoMenosUmaLetraMaiuscula.setarProximoValidador(aoMenosUmaLetraMinuscula);
        aoMenosUmaLetraMinuscula.setarProximoValidador(aoMenosUmCaractereEspecial);

        return noveOuMaisCaracteres;
    }
}
