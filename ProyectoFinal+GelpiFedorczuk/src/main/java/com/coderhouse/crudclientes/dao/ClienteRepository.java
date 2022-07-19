package com.coderhouse.crudclientes.dao;

import com.coderhouse.crudclientes.modelCliente.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {
}
