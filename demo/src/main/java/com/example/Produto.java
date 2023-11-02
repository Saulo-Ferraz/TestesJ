package com.example;

public class Produto {

    private String nome;
    private double preco;
    private String tipo;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, String tipo, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidade(){
        return quantidadeEmEstoque;
    }

    public void setQuantidade(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public boolean ehDoTipo(String tipo) {
        return this.tipo.equalsIgnoreCase(tipo);
    }

    public void alterarPreco(double preco) {
        this.preco = preco;
    }

    public double calcularPrecoTotal(int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("A quantidade deve ser positiva");
        }
        return preco * quantidade;
    }

    public void aplicarDesconto(double percentualDesconto) {
        if (percentualDesconto < 0) {
            throw new IllegalArgumentException("O desconto deve ser positivo");
        }
        preco -= preco * (percentualDesconto / 100);
    }
    
    public boolean estaDisponivelNoEstoque(int quantidadeEmEstoque) {
        return quantidadeEmEstoque > 0;
    }
    
    public void alterarNome(String novoNome) {
        if (novoNome == null || novoNome.isEmpty()) {
            throw new IllegalArgumentException("O nome do produto não pode ser vazio ou nulo");
        }
        nome = novoNome;
    }
    
    public void atualizarQuantidadeEmEstoque(int novaQuantidadeEmEstoque){
        if (novaQuantidadeEmEstoque != quantidadeEmEstoque) {
            throw new IllegalArgumentException("Nova quantidade não pode ser igual a atual");
        }

        quantidadeEmEstoque = novaQuantidadeEmEstoque;
    }
}
