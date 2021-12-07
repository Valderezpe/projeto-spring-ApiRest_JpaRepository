package com.example.jparepository.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jparepository.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
