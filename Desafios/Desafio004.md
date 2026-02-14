# Desafio 4 — API de Empréstimo de Equipamentos

## 1. Contexto da História

Uma empresa empresta notebooks para funcionários. Alguns estão pegando vários equipamentos e outros sem autorização.

---

## 2. Problema Proposto

A API deve:

- Registrar empréstimo
- Permitir no máximo 1 notebook por funcionário
- Verificar se notebook está disponível

### Endpoints:

- `POST /loans`
- `POST /return`

---

## 3. Modelagem Backend

### Variáveis:

- `funcionarioId`
- `notebookId`
- `possuiNotebook`
- `disponivel`

---

## 4. Pseudocódigo

```
if funcionario ja possui notebook:
    return 400

if notebook nao disponivel:
    return 400

registrar emprestimo

return 201
```

---

## 5. Conceitos Trabalhados

- Relacionamento entre entidades
- Validação de regra
- Controle de disponibilidade