package com.example.SRBDlab3.sale;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaleGTORepository
        extends JpaRepository<SaleGTO, Integer> {
}
