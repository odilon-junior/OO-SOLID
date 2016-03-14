package br.com.capitulo1.models;

/**
 * Created by odilon on 13/03/16.
 */
public class Funcionario {

    private String nome;
    private double salario;
    private Cargo cargo;

    public double getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public double getAumentoSalario() {
        return cargo.getRegra().calcular(this);
    }

}
