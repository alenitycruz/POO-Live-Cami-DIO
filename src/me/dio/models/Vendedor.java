package me.dio.models;

public class Vendedor extends FuncionarioClt implements CalculaBonificacao {

    private Double valorBonificacao;

    @Override
    public void calculaBonificacao(Double porcentagemBonificacao) {
        this.valorBonificacao = (super.getValorSalario() * (porcentagemBonificacao/100));
    }


    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco.getBairro() +
                ", valorBonificacao=" + this.valorBonificacao +
                '}';
    }
}
