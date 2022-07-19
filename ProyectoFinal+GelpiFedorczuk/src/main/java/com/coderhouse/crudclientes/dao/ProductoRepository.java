package com.coderhouse.crudclientes.dao;

import com.coderhouse.crudclientes.modelProducto.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<ProductoEntity, Long> {
}
