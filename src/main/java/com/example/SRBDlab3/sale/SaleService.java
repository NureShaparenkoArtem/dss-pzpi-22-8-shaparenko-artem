package com.example.SRBDlab3.sale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {

    private final SaleRepository saleRepository;
    private final SaleGTORepository saleGTORepository;

    @Autowired
    public SaleService(SaleRepository saleRepository, SaleGTORepository saleGTORepository) {
        this.saleRepository = saleRepository;
        this.saleGTORepository = saleGTORepository;
    }

    public List<Sale> getSales() {
        return saleRepository.findAll();
    }

    public List<SaleGTO> getSalesGTO() {
        return saleGTORepository.findAll();
    }

    public void deleteById(Integer id) {
        saleRepository.deleteById(id);
    }
}
