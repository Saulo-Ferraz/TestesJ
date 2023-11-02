package com.example;

public class Funcionario {
    
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario){
        this.nome = nome;
        this.cargo = cargo; // Cargos = Vendedor, Gerente
        this.salario = salario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumentarSalario(double percentual) {
        if (percentual < 0) {
            throw new IllegalArgumentException("O percentual de aumento deve ser positivo");
        }
        salario += salario * (percentual / 100);
    }

    public void alterarCargo(String novoCargo) {
        this.cargo = novoCargo;
    }

    public boolean ePromovivel() {
        return "Gerente".equalsIgnoreCase(cargo);
    }
}
