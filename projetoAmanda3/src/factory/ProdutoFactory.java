package src.factory;
import src.service.Produto;

public abstract class ProdutoFactory {
    // Método para criar um novo produto (será implementado pelas fábricas concretas)
    public abstract Produto criarProduto(int id, String nome, int categoria, int quantidade, float preco);
}
