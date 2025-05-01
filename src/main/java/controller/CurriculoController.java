package com.curriculo.curriculoapi.controller;

import com.curriculo.curriculoapi.model.Curriculo;
import com.curriculo.curriculoapi.service.CurriculoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curriculos")
public class CurriculoController {

    private final CurriculoService service;

    public CurriculoController(CurriculoService service) {
        this.service = service;
    }

    @PostMapping
    public Curriculo criar(@RequestBody Curriculo curriculo) {
        return service.salvar(curriculo);
    }

    @GetMapping
    public List<Curriculo> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Curriculo buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
