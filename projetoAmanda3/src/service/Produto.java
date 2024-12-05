package src.service;
public class Produto {
    // Atributos
    private int id;
    private String nome;
    private int categoria;  // 1: Alimentos, 2: Eletrônicos, 3: Limpeza
    private int quantidade;
    private float preco;

    // Construtor
    public Produto(int id, String nome, int categoria, int quantidade, float preco) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    // Métodos

    // Atualiza a quantidade do produto
    public void atualizarQuantidade(int qtd) {
        this.quantidade = qtd;
    }

    // Atualiza o preço do produto
    public void atualizarPreco(float preco) {
        this.preco = preco;
    }

    // Atualiza o nome do produto
    public void atualizarNome(String nome) {
        this.nome = nome;
    }

    // Atualiza a categoria do produto (1: Alimentos, 2: Eletrônicos, 3: Limpeza)
    public void atualizarCategoria(int categoria) {
        this.categoria = categoria;
    }

    // Getters e Setters (para acessar os atributos)
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getCategoria() {
        return categoria;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public float getPreco() {
        return preco;
    }
}
