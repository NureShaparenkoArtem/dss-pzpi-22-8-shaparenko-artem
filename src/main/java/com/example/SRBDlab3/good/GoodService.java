package com.example.SRBDlab3.good;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class GoodService {

    private final GoodRepository goodRepository;

    @Autowired
    public GoodService(GoodRepository goodRepository) {
        this.goodRepository = goodRepository;
    }

    @Transactional
    public void updateDescription(Integer departmentId) {
        goodRepository.updateDescription(departmentId);
    }

    public void updateGoodPrice(Integer regGoodId, Double newPrice) {
        try {
            goodRepository.updateGoodPrice(regGoodId, newPrice);
        } catch (Exception e) {
            if (e.getMessage().contains("Good with ID")) {
                throw new IllegalArgumentException("Good with ID " + regGoodId + " does not exist");
            }
            throw new RuntimeException("Unexpected error occurred", e);
        }
    }

    public List<Good> getGoods() {
        return goodRepository.findAll();
    }
}