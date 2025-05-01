package com.curriculo.curriculoapi.service;

import com.curriculo.curriculoapi.model.Curriculo;
import com.curriculo.curriculoapi.repository.CurriculoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurriculoService {

    private final CurriculoRepository repository;

    public CurriculoService(CurriculoRepository repository) {
        this.repository = repository;
    }

    public Curriculo salvar(Curriculo curriculo) {
        return repository.save(curriculo);
    }

    public List<Curriculo> listarTodos() {
        return repository.findAll();
    }

    public Curriculo buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
