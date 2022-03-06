package me.dio.models;

public class Endereco {
    private String rua;
    private String complento;
    private String bairro;

    public Endereco(String rua, String complento, String bairro) {
        this.rua = rua;
        this.complento = complento;
        this.bairro = bairro;
    }

    public Endereco() {
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getComplento() {
        return complento;
    }

    public void setComplento(String complento) {
        this.complento = complento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", complento='" + complento + '\'' +
                ", bairro='" + bairro + '\'' +
                '}';
    }
}
