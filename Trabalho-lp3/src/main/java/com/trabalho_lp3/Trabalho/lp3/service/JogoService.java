package com.trabalho_lp3.Trabalho.lp3.service;

import com.trabalho_lp3.Trabalho.lp3.mapper.JogoMapper;
import com.trabalho_lp3.Trabalho.lp3.models.Jogo;
import com.trabalho_lp3.Trabalho.lp3.repository.JogoRepository;
import com.trabalho_lp3.Trabalho.lp3.representation.CriarJogoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JogoService {

    @Autowired
    private JogoRepository repository;

    public void criarJogo(CriarJogoRequest request) throws Exception {

        Jogo response = repository.findByTitulo(request.getTitulo());

        if (response != null) {
            if (request.getPlataforma().equals(response.getPlataforma())) throw new Exception("Jogo já existe");
        }

        repository.save(JogoMapper.criarJogoRequestToModel(request));
    }

    public Jogo buscarJogoPorTitulo(String titulo) {
        return repository.findByTitulo(titulo);
    }

    public Jogo buscarJogoPorGenero(String genero) {
        return repository.findByGenero(genero);
    }

    public Jogo buscarJogoPorTituloeGenero(String titulo, String genero) {
        return repository.findByTituloAndGenero(titulo, genero);
    }

    public void like(Jogo jogo) {
        jogo.darLike();
        repository.save(jogo);
    }

    public void deslikes(Jogo jogo) {
        jogo.darDeslike();
        repository.save(jogo);
    }
}
