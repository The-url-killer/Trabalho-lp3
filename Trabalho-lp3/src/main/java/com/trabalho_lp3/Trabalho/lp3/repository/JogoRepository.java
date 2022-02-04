package com.trabalho_lp3.Trabalho.lp3.repository;

import com.trabalho_lp3.Trabalho.lp3.models.Jogo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface JogoRepository extends JpaRepository<Jogo, UUID> {

    Jogo findByTitulo(String titulo);

    Jogo findByGenero(String genero);

    Jogo findByTituloAndGenero(String titulo, String genero);
}
