package me.dio.models;

public class Gerente extends FuncionarioPj implements CalculaBonificacao {

    private Double valorBonificacao;

    @Override
    public void calculaBonificacao(Double porcentagemBonificacao) {
        this.valorBonificacao = (super.getValorRemuneracao() * (porcentagemBonificacao/100d)) + 100d;
    }

    @Override
    public String toString() {
        return "FuncionarioPj{" +
                "nome='" + super.getNome() + '\'' +
                ", documento='" + super.getDocumento() + '\'' +
                ", horasTrabahadas=" + super.getHorasTrabahadas() +
                ", valorHora=" + super.getValorHora() +
                ", valorRemuneracao=" + super.getValorRemuneracao() +
                ", endereco=" + super.getEndereco().getBairro() +
                ", valorBonificacao=" + this.valorBonificacao +
                '}';
    }
}
