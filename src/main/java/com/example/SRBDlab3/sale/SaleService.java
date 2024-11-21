package com.example.SRBDlab3.sale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {

    private final SaleRepository saleRepository;

    @Autowired
    public SaleService(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }

    public List<Sale> getSales() {
        return saleRepository.findAll();
    }

    public void deleteById(Integer id) {
        saleRepository.deleteById(id);
    }
}
