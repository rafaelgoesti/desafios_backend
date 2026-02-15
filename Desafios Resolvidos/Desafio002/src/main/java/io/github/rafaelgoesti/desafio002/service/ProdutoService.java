package io.github.rafaelgoesti.desafio002.service;
import io.github.rafaelgoesti.desafio002.model.Produto;
import io.github.rafaelgoesti.desafio002.repository.ProdutoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;

@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    public Produto criarProduto(String nomeProduto, Integer estoque) {

        Produto produto = new Produto(
                nomeProduto,
                estoque
                );
        return produtoRepository.save(produto);
    }

    public Produto comprarProduto(String nomeProduto, Integer quantidadePedido) {
        Produto produto = produtoRepository.findByNomeProduto(nomeProduto)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));

        if (produto.getEstoque() == 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Produtto sem estoque.");
        }

        if (quantidadePedido > produto.getEstoque()){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Quantidade indisponível");
        }

        produto.setEstoque(produto.getEstoque() - quantidadePedido); // Return 10
        produto.setQuantidadePedido(quantidadePedido);

        return produtoRepository.save(produto);
    }

    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    /*public Produto atualizarProduto(String nomeProduto, Integer estoque){
        Produto produto = produtoRepository.findByNomeProduto(nomeProduto)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));

        produto.setNomeProduto(nomeProduto);
        produto.setEstoque(estoque);

        return produtoRepository.save(produto);
    }*/
}
