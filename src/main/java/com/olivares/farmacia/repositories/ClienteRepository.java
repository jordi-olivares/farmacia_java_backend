package com.olivares.farmacia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.olivares.farmacia.model.ClienteDO;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteDO,Long>{
    
}
