package com.example;

public class Venda {

    private Produto produto;
    private int quantidade;
    private double valor;

    public Venda(Produto produto, int quantidade, double valor) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValor() {
        return valor;
    }

    public double calcularValorTotal() {
        return produto.getPreco() * quantidade;
    }
    
    public boolean eElegivelParaDesconto() {
        return quantidade >= 5;
    }

    public void aplicarDesconto(double percentualDesconto) {
        if (eElegivelParaDesconto()) {
            double desconto = calcularValorTotal() * (percentualDesconto / 100);
            valor -= desconto;
        }
    }
    
}
