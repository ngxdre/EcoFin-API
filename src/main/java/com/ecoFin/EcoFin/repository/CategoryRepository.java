package com.ecoFin.EcoFin.repository;

import com.ecoFin.EcoFin.domain.category.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> { }