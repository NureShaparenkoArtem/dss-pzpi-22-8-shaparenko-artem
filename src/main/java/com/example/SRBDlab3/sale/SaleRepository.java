package com.example.SRBDlab3.sale;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaleRepository
        extends JpaRepository<Sale, Integer> {
}
