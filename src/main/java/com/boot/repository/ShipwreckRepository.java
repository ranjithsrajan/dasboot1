package com.boot.repository;

import com.boot.model.Shipwreck;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by id00 on 20/05/17.
 */
public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long> {
}

