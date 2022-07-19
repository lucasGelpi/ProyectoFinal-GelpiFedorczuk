package com.coderhouse.crudclientes.dao;

import com.coderhouse.crudclientes.modelCompr.ComprobanteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComprobanteRepository extends JpaRepository<ComprobanteEntity, Long> {
}