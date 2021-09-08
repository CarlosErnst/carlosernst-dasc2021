package br.univille.carlosernstdacs2021.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.univille.carlosernstdacs2021.service.ProdutoService;


import br.univille.carlosernstdacs2021.model.Produto;

@RestController
@RequestMapping("/api/v1/produtos")
public class ProdutoControllerAPI {
    
    @Autowired
    private ProdutoService service;

    @GetMapping
    public ResponseEntity<List<Produto>> getAll(){
        return new ResponseEntity<List<Produto>>(service.getAllProdutos(), HttpStatus.OK);
    }

}
