package io.github.rafaelgoesti.desafio002.controller;
import io.github.rafaelgoesti.desafio002.controller.dto.ComprarProdutoControllerDto;
import io.github.rafaelgoesti.desafio002.controller.dto.CriarProdutoControllerDto;
import io.github.rafaelgoesti.desafio002.model.Produto;
import io.github.rafaelgoesti.desafio002.service.ProdutoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping()
public class ProdutoController {
    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping(path = "/products")
    public ResponseEntity<?> createProducts(@RequestBody CriarProdutoControllerDto dto) {
        Produto produto = produtoService.criarProduto(
                dto.nomeProduto(),
                dto.estoque()
        );

        return ResponseEntity.status(HttpStatus.CREATED).body(produto);
    }

    @GetMapping(path = "/products")
    public ResponseEntity<List<Produto>> listarProdutos() {
        List<Produto> produtos = produtoService.listarProdutos();
        return ResponseEntity.ok(produtos);
    }

    @PostMapping(path = "/orders")
    public ResponseEntity<?> crateOrders(@RequestBody ComprarProdutoControllerDto request){
        Produto pedido = produtoService.comprarProduto(
                request.nomeProduto(),
                request.quantidadePedido()
        );

        return ResponseEntity.status(HttpStatus.CREATED).body("Pedido aprovado");
    }

}
