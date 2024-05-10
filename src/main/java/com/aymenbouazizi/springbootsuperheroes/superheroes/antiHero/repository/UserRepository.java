package com.aymenbouazizi.springbootsuperheroes.superheroes.antiHero.repository;

import com.aymenbouazizi.springbootsuperheroes.superheroes.antiHero.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
}
