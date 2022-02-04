package com.trabalho_lp3.Trabalho.lp3.models;

import com.trabalho_lp3.Trabalho.lp3.models.enums.Plataforma;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "game_awards")
public class Jogo {

    @Id
    private UUID id;

    private String titulo;

    private Plataforma plataforma;

    private String genero;

    private Date anoDeLancamento;

    private Integer likes;

    private Integer deslikes;

    public void darLike() {
        setLikes(likes++);
    }

    public void darDeslike() {
        setDeslikes(deslikes++);
    }
}
