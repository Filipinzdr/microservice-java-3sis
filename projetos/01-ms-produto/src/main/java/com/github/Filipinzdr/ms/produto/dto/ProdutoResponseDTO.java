package com.github.Filipinzdr.ms.produto.dto;

import com.github.Filipinzdr.ms.produto.domain.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoResponseDTO {

    private Long id;
    private String nome;
    private String descricao;
    private Double valor;

    public ProdutoResponseDTO() {
    }

    public ProdutoResponseDTO(Long id, String nome, String descricao, Double valor) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    public static List<ProdutoResponseDTO> createMock() {

        return List.of(
                new ProdutoResponseDTO(1L, "Smart TV", "Smart TV LG LED 50 polegadas", 2285.0),
                new ProdutoResponseDTO(2L, "notebook", "notebook alienware", 6000.0),
                new ProdutoResponseDTO(3L, "Mouse Gamer", "Mouse Gamer Razer", 330.0)
        );


    }


    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }
}
