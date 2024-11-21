package com.example.SRBDlab3.good;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodRepository
        extends JpaRepository<Good, Integer> {

    // @Procedure(name = "test.UpdateDescription") чомусь не працює?
    @Modifying
    @Query(value = "CALL test.UpdateDescription(:department_id)", nativeQuery = true)
    void updateDescription(@Param("department_id") Integer departmentId);

    @Query(value = "SELECT test.update_good_price(:reg_good_id, :new_price)", nativeQuery = true)
    void updateGoodPrice(@Param("reg_good_id") Integer regGoodId, @Param("new_price") Double newPrice);
}