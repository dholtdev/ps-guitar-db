package com.guitar.db.repository;

import com.guitar.db.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by david.holt on 5/22/16.
 */
public interface LocationJpaRepository extends JpaRepository<Location, Long> {
}
