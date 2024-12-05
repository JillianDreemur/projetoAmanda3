package src.service;

import java.util.ArrayList;
import java.util.List;

public class EstoqueService {
    // Lista para armazenar os produtos no estoque
    private List<Produto> estoque;

    // Construtor
    public EstoqueService() {
        this.estoque = new ArrayList<>();
    }

    // Adiciona um novo produto ao estoque
    public void adicionarProduto(Produto produto) {
        estoque.add(produto);
    }

    // Atualiza as informações de um produto existente no estoque
    public void atualizarProduto(int id, Produto produtoAtualizado) {
        for (Produto produto : estoque) {
            if (produto.getId() == id) {
                produto.atualizarNome(produtoAtualizado.getNome());
                produto.atualizarPreco(produtoAtualizado.getPreco());
                produto.atualizarQuantidade(produtoAtualizado.getQuantidade());
                produto.atualizarCategoria(produtoAtualizado.getCategoria());
                break;
            }
        }
    }

    // Remove um produto do estoque
    public void removerProduto(int id) {
        estoque.removeIf(produto -> produto.getId() == id);
    }

    // Retorna a lista de todos os produtos no estoque
    public List<Produto> listarProdutos() {
        return estoque;
    }
}
