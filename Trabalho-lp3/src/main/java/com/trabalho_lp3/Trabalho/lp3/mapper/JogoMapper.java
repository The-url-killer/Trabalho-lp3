package com.trabalho_lp3.Trabalho.lp3.mapper;

import com.trabalho_lp3.Trabalho.lp3.models.Jogo;
import com.trabalho_lp3.Trabalho.lp3.representation.CriarJogoRequest;

import java.util.UUID;

public class JogoMapper {

    public static Jogo criarJogoRequestToModel(CriarJogoRequest criarJogoRequest) {
        Jogo jogo = new Jogo();

        jogo.setId(UUID.randomUUID());
        jogo.setDeslikes(0);
        jogo.setAnoDeLancamento(criarJogoRequest.getAnoDeLancamento());
        jogo.setGenero(criarJogoRequest.getGenero());
        jogo.setLikes(0);
        jogo.setPlataforma(criarJogoRequest.getPlataforma());
        jogo.setTitulo(criarJogoRequest.getTitulo());

        return jogo;
    }
}
