package io.github.rafaelgoesti.dessafio001.repository;

import io.github.rafaelgoesti.dessafio001.controller.dto.CreateUserControllerDto;
import io.github.rafaelgoesti.dessafio001.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);
}
