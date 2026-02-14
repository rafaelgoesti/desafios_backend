# Desafio 1 — API de Cadastro de Usuários

## 1. Contexto da História

Uma startup precisa de uma API para cadastrar usuários no sistema. Estão ocorrendo problemas com emails duplicados e senhas fracas.

## 2. Problema Proposto

A API deve:

- Cadastrar usuário
- Não permitir email duplicado
- Exigir senha com mínimo 6 caracteres
- Retornar status correto (201, 400, 409)

### Endpoints esperados:

```
POST /users
GET /users/{id}
```

## 3. Modelagem Backend

### Variáveis:

- `email`
- `senha`
- `usuarioExiste`
- `senhaValida`

## 4. Pseudocódigo

```
if email ja existe:
    return 409 "Email já cadastrado"

if tamanho senha < 6:
    return 400 "Senha inválida"

salvar usuario

return 201 "Usuário criado"
```

## 5. Conceitos Trabalhados

- CRUD básico
- Validação de dados
- Status HTTP
- Estrutura condicional
- Primeira regra de negócio