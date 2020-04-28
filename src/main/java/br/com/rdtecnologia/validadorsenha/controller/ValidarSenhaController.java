package br.com.rdtecnologia.validadorsenha.controller;

import br.com.rdtecnologia.validadorsenha.service.ValidarSenhaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidarSenhaController {

    @Autowired
    private ValidarSenhaService validarSenhaService;

    @PostMapping("senha/validar")
    public boolean validarSenha(@RequestParam String senha) {
        return validarSenhaService.validar(senha);
    }

}
