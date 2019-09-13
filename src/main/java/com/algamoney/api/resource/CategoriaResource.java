package com.algamoney.api.resource;

import com.algamoney.api.model.Categoria;
import com.algamoney.api.repositorio.CategoriaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {
    @Autowired
    private CategoriaRepositorio categoriaRepositorio;


    @GetMapping
    public List<Categoria> listar() {
        List<Categoria> categorias = categoriaRepositorio.findAll();
        return categorias;
    }
}
