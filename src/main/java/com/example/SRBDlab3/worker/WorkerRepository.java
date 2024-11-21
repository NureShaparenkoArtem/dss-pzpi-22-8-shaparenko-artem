package com.example.SRBDlab3.worker;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Integer> {

    @Query(value = "SELECT test.CountWorkersScalar(:address_input)", nativeQuery = true)
    Integer countWorkersByAddressScalar(@Param("address_input") String addressInput);

    @Query(value = "SELECT test.CountWorkersTabular(:address_input)", nativeQuery = true)
    List<String> countWorkersByAddressTabular(@Param("address_input") String addressInput);
}
