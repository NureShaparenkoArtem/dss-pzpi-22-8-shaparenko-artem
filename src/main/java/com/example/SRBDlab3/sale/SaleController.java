package com.example.SRBDlab3.sale;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/sale")
@CrossOrigin(origins = "http://localhost:3000")
public class SaleController {

    private final SaleService saleService;

    @Autowired
    public SaleController(SaleService saleService) {
        this.saleService = saleService;
    }

    @GetMapping
    public List<Sale> getSales(){
        return saleService.getSales();
    }

    @GetMapping("/details")
    public List<SaleDTO> getSalesGTO(){
        return saleService.getSalesDTO();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSale(@PathVariable Integer id) {
        saleService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
