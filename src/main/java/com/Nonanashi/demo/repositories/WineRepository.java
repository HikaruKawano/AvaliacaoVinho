package com.Nonanashi.demo.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Nonanashi.demo.model.WineModel;

@Repository
public interface WineRepository extends JpaRepository<WineModel, UUID>{
    
}
