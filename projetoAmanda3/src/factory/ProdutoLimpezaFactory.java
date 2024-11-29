package src.factory;
import src.service.Produto;

public class ProdutoLimpezaFactory extends ProdutoFactory {

    // Método para criar um produto do tipo Limpeza
    @Override
    public Produto criarProduto(int id, String nome, int categoria, int quantidade, float preco) {
        // Criando e retornando um produto do tipo Limpeza
        return new Produto(id, nome, categoria, quantidade, preco);
    }
}
