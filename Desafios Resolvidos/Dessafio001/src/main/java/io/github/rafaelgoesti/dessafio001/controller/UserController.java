package io.github.rafaelgoesti.dessafio001.controller;

import io.github.rafaelgoesti.dessafio001.controller.dto.CreateUserControllerDto;
import io.github.rafaelgoesti.dessafio001.model.User;
import io.github.rafaelgoesti.dessafio001.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody CreateUserControllerDto request) {
        User user = userService.create(
                request.email(),
                request.senha()
        );

        return ResponseEntity.status(HttpStatus.CREATED).body("Usuário criado");
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id) {
        User user = userService.getById(id);
        return ResponseEntity.ok(user);
    }

}
