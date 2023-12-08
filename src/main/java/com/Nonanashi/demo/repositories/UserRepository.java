package com.Nonanashi.demo.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Nonanashi.demo.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, UUID> {
    
}
