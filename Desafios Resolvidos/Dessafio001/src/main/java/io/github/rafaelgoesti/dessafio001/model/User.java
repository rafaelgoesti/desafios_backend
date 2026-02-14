package io.github.rafaelgoesti.dessafio001.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String senha;

    private boolean usuarioExiste;
    private boolean senhaValida;

    public User(String email, String senha) {
        this.email = email;
        this.senha = senha;
        this.usuarioExiste = true;
        this.senhaValida = true;
    }

    public User() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isUsuarioExiste() {
        return usuarioExiste;
    }

    public void setUsuarioExiste(boolean usuarioExiste) {
        this.usuarioExiste = usuarioExiste;
    }

    public boolean isSenhaValida() {
        return senhaValida;
    }

    public void setSenhaValida(boolean senhaValida) {
        this.senhaValida = senhaValida;
    }
}
