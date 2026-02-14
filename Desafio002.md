# Desafio 2 — API de Controle de Produtos

## 1. Contexto da História

Um pequeno ecommerce precisa controlar estoque. Estão vendendo produtos com quantidade zerada.

---

## 2. Problema Proposto

A API deve:

- Criar produto
- Listar produtos
- Atualizar estoque
- Bloquear venda se estoque = 0

### Endpoints:

- `POST /products`
- `GET /products`
- `POST /orders`

---

## 3. Modelagem Backend

### Variáveis:

- `nomeProduto`
- `estoque`
- `quantidadePedido`

---

## 4. Pseudocódigo

```
buscar produto

if estoque == 0:
    return 400 "Produto sem estoque"

if quantidadePedido > estoque:
    return 400 "Quantidade indisponível"

estoque = estoque - quantidadePedido

salvar

return 200 "Pedido aprovado"
```

---

## 5. Conceitos Trabalhados

- Regra de negócio
- Controle de estado
- Atualização de banco
- Fluxo de pedido