package src.factory;
import src.service.Produto;

public class ProdutoEletronicoFactory extends ProdutoFactory {

    // Método para criar um produto do tipo Eletrônico
    @Override
    public Produto criarProduto(int id, String nome, int categoria, int quantidade, float preco) {
        // Criando e retornando um produto do tipo Eletrônico
        return new Produto(id, nome, categoria, quantidade, preco);
    }
}
