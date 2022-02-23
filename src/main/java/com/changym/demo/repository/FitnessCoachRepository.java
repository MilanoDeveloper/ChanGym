package com.changym.demo.repository;

import com.changym.demo.dto.FitnessCoachDTO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FitnessCoachRepository extends JpaRepository<FitnessCoachDTO, Long>{
    
}
