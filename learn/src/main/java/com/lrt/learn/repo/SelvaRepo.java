package com.lrt.learn.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lrt.learn.entity.SelvaTable;

public interface SelvaRepo extends JpaRepository<SelvaTable, Integer> {

}
