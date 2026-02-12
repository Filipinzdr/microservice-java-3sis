package com.github.Filipinzdr.ms.produto.controller;

import com.github.Filipinzdr.ms.produto.domain.Produto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @GetMapping
    public ResponseEntity<Produto> getProduto() {

        Produto produto = new Produto(1L, "Smart TV", "Smart TV LG LED 50 polegadas", 2285.0);

        return ResponseEntity.ok(produto);

    }


}
