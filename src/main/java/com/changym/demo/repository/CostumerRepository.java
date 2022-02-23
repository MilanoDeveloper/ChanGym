package com.changym.demo.repository;

import com.changym.demo.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CostumerRepository extends JpaRepository<User, Long> {
    
}
