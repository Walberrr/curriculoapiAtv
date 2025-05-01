package com.curriculo.curriculoapi.repository;

import com.curriculo.curriculoapi.model.Curriculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurriculoRepository extends JpaRepository<Curriculo, Long> {
}