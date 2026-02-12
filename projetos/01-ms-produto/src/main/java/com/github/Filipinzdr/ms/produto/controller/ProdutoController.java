package com.github.Filipinzdr.ms.produto.controller;

import com.github.Filipinzdr.ms.produto.domain.Produto;
import com.github.Filipinzdr.ms.produto.dto.ProdutoRequestDTO;
import com.github.Filipinzdr.ms.produto.dto.ProdutoResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @GetMapping
    public ResponseEntity<List<ProdutoResponseDTO>> getProduto() {

        List<ProdutoResponseDTO> dto = ProdutoResponseDTO.createMock();
        return ResponseEntity.ok(dto);

    }

    @PostMapping
    public ResponseEntity<ProdutoResponseDTO> createProduto(@RequestBody ProdutoRequestDTO inputDTO){
        ProdutoResponseDTO dto =  new ProdutoResponseDTO(1L, inputDTO.getNome(), inputDTO.getDescricao(), inputDTO.getValor());


        return ResponseEntity.created(null).body(dto);

    }


}
