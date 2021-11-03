package com.devsuperior.vgavendas.services;

import com.devsuperior.vgavendas.dto.SaleDTO;
import com.devsuperior.vgavendas.entities.Sale;
import com.devsuperior.vgavendas.repositories.SaleRepository;
import com.devsuperior.vgavendas.repositories.SellerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SaleService {
    
    @Autowired
    private SellerRepository sellerRepository;

    @Autowired
    private SaleRepository repository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable){
        sellerRepository.findAll();
        Page<Sale> result = repository.findAll(pageable);
        return result.map(x -> new SaleDTO(x));
    }
}
