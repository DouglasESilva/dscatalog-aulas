package com.devsuperior.dscatalog.repositoy;

import com.devsuperior.dscatalog.entities.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
}
