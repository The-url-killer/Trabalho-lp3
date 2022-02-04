package com.trabalho_lp3.Trabalho.lp3.controller;

import com.trabalho_lp3.Trabalho.lp3.representation.CriarJogoRequest;
import com.trabalho_lp3.Trabalho.lp3.service.JogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class JogoController {

    @Autowired
    private JogoService service;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    private void criarJogo(@RequestBody CriarJogoRequest criarJogoRequest) throws Exception {
        service.criarJogo(criarJogoRequest);
    }

}
