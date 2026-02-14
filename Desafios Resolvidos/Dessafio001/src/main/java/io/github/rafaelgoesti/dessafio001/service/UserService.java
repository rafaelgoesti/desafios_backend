package io.github.rafaelgoesti.dessafio001.service;

import io.github.rafaelgoesti.dessafio001.model.User;
import io.github.rafaelgoesti.dessafio001.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User create(String email, String senha) {
        if (userRepository.existsByEmail(email)) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Email já cadastrado.");
        }
        if (senha == null || senha.length() < 6) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Senha inválida.");
        }
        User user = new User(email, senha);
        return userRepository.save(user);
    }

    public User getById(Long id){
        return userRepository.findById(id)
                .orElseThrow(() ->
                        new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuário não encontrado."));
    }
}
