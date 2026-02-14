# Desafio 5 — API de Sistema de Avaliação

## 1. Contexto da História

Uma plataforma de cursos quer permitir avaliações, mas alunos estão enviando notas inválidas.

---

## 2. Problema Proposto

A API deve:

- Receber nota de 1 a 5
- Não aceitar fora desse intervalo
- Permitir somente 1 avaliação por aluno

### Endpoints:

- `POST /ratings`
- `GET /ratings/course/{id}`

---

## 3. Modelagem Backend

### Variáveis:

- `alunoId`
- `cursoId`
- `nota`
- `avaliou`

---

## 4. Pseudocódigo

```
if nota < 1 OR nota > 5:
    return 400

if aluno ja avaliou curso:
    return 409

salvar avaliacao

return 201
```

---

## 5. Conceitos Trabalhados

- Validação de intervalo
- Regra de unicidade
- Persistência