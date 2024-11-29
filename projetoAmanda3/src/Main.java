package src;
import src.factory.ProdutoAlimentoFactory;
import src.factory.ProdutoEletronicoFactory;
import src.factory.ProdutoLimpezaFactory;
import src.factory.ProdutoFactory;
import src.service.EstoqueService;
import src.service.Produto;
import src.service.RelatorioService;

public class Main {
    public static void main(String[] args) {
        // Criação de fábricas
        ProdutoFactory alimentoFactory = new ProdutoAlimentoFactory();
        ProdutoFactory eletronicoFactory = new ProdutoEletronicoFactory();
        ProdutoFactory limpezaFactory = new ProdutoLimpezaFactory();

        // Criando produtos
        Produto alimento = alimentoFactory.criarProduto(1, "Arroz", 1, 50, 10.0f);
        Produto eletronico = eletronicoFactory.criarProduto(2, "TV", 2, 20, 1500.0f);
        Produto limpeza = limpezaFactory.criarProduto(3, "Detergente", 3, 100, 5.0f);

        // Adicionando produtos ao estoque
        EstoqueService estoqueService = new EstoqueService();
        estoqueService.adicionarProduto(alimento);
        estoqueService.adicionarProduto(eletronico);
        estoqueService.adicionarProduto(limpeza);

        // Gerando relatório de movimentação
        RelatorioService relatorioService = new RelatorioService();
        relatorioService.gerarRelatorioMovimentacao(estoqueService.listarProdutos());
    }
}
