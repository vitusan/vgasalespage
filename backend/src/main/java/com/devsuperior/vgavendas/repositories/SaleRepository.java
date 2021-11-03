package com.devsuperior.vgavendas.repositories;

import com.devsuperior.vgavendas.entities.Sale;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long>{
    
}
