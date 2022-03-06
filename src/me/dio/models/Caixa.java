package me.dio.models;

public class Caixa extends FuncionarioClt{

    public Caixa(String nome, String documento, Double valorSalario, Endereco endereco) {
        super(nome, documento, valorSalario, endereco);
    }

    public Caixa() {
    }

    @Override
    public String toString() {
        return "Caixa{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco +
                '}';
    }
}
