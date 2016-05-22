package com.guitar.db.repository;

import com.guitar.db.model.ModelType;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by david.holt on 5/22/16.
 */
public interface ModelTypeJpaRepository extends JpaRepository<ModelType, Long> {
}
