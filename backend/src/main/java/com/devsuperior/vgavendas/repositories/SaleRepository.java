package com.devsuperior.vgavendas.repositories;

import java.util.List;

import com.devsuperior.vgavendas.dto.SaleSuccessDTO;
import com.devsuperior.vgavendas.dto.SaleSumDTO;
import com.devsuperior.vgavendas.entities.Sale;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SaleRepository extends JpaRepository<Sale, Long>{
    
    @Query("SELECT new com.devsuperior.vgavendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount))"
            + " FROM Sale as obj GROUP BY obj.seller")
    List<SaleSumDTO> amountGroupedBySeller();

    @Query("SELECT new com.devsuperior.vgavendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals))"
            + " FROM Sale as obj GROUP BY obj.seller")
    List<SaleSuccessDTO> successGroupedBySeller();
}
