# Desafio 3 — API de Login com Token

## 1. Contexto da História

Um sistema interno precisa de autenticação. Usuários estão acessando sem validação.

---

## 2. Problema Proposto

A API deve:

- Fazer login
- Validar email e senha
- Gerar token
- Bloquear login inválido

### Endpoints:

- `POST /login`

---

## 3. Modelagem Backend

### Variáveis:

- `email`
- `senha`
- `usuarioEncontrado`
- `token`

---

## 4. Pseudocódigo

```
buscar usuario por email

if nao encontrado:
    return 401

if senha incorreta:
    return 401

gerar token

return 200 token
```

---

## 5. Conceitos Trabalhados

- Autenticação
- Geração de token
- Segurança básica
- HTTP 401