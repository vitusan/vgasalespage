package com.devsuperior.vgavendas.repositories;

import com.devsuperior.vgavendas.entities.Seller;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long>{
    
}
