package com.trabalho_lp3.Trabalho.lp3.representation;

import com.trabalho_lp3.Trabalho.lp3.models.enums.Plataforma;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
@AllArgsConstructor
public class CriarJogoRequest {
    private String titulo;
    private Plataforma plataforma;
    private String genero;
    private Date anoDeLancamento;
}
