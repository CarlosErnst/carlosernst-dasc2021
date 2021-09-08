package br.univille.carlosernstdacs2021.service;

import java.util.List;
import br.univille.carlosernstdacs2021.model.Fornecedor;

public interface FornecedorService {
    public List<Fornecedor> getAllFornecedores();
    public Fornecedor save(Fornecedor fornecedor);
}