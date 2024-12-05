package src.service;

import java.util.List;

public class RelatorioService {

    // Gera um relatório de movimentações no estoque
    public void gerarRelatorioMovimentacao(List<Produto> estoque) {
        System.out.println("Relatório de Movimentação de Estoque:");
        for (Produto produto : estoque) {
            System.out.println("Produto: " + produto.getNome() + " | Quantidade Atual: " + produto.getQuantidade());
        }
    }

    // Gera um relatório de produtos por categoria
    public void gerarRelatorioPorCategoria(List<Produto> estoque, int categoria) {
        String categoriaNome = "";
        switch (categoria) {
            case 1:
                categoriaNome = "Alimentos";
                break;
            case 2:
                categoriaNome = "Eletrônicos";
                break;
            case 3:
                categoriaNome = "Limpeza";
                break;
            default:
                categoriaNome = "Desconhecida";
                break;
        }
        System.out.println("Relatório de Produtos - Categoria: " + categoriaNome);
        for (Produto produto : estoque) {
            if (produto.getCategoria() == categoria) {
                System.out.println("Produto: " + produto.getNome() + " | Quantidade: " + produto.getQuantidade() + " | Preço: " + produto.getPreco());
            }
        }
    }
}
