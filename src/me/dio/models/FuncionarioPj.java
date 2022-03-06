package me.dio.models;

public abstract class FuncionarioPj {
    private String nome;
    private String documento;
    private Integer horasTrabahadas;
    private Double valorHora;
    private Double valorRemuneracao;
    private Endereco endereco;

    public void calcularRemuneracao() {
        this.valorRemuneracao = this.valorHora * this.horasTrabahadas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Integer getHorasTrabahadas() {
        return horasTrabahadas;
    }

    public void setHorasTrabahadas(Integer horasTrabahadas) {
        this.horasTrabahadas = horasTrabahadas;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Double getValorRemuneracao() {
        return valorRemuneracao;
    }

    public void setValorRemuneracao(Double valorRemuneracao) {
        this.valorRemuneracao = valorRemuneracao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


}
