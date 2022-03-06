package me.dio;

import me.dio.models.Caixa;
import me.dio.models.Endereco;
import me.dio.models.Gerente;
import me.dio.models.Vendedor;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco(" Rua do Hospício", " n 111, apto 105 ", " Boa Vista ");

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Alessandra Cruz");
        vendedor.setDocumento("XXX.220.000-11");
        vendedor.setValorSalario(3500d);
        vendedor.setEndereco(endereco);

        Vendedor vendedor1 = new Vendedor();
        vendedor1.setNome("Ananda de Sá");
        vendedor1.setDocumento("YYY.000.888-11");
        vendedor1.setValorSalario(10000d);
        vendedor1.setEndereco(endereco);

        Vendedor vendedor2 = new Vendedor();
        vendedor2.setNome("Victor");
        vendedor2.setDocumento("000.000.000-00");
        vendedor2.setValorSalario(450d);
        vendedor2.setEndereco(endereco);

        Caixa caixa = new Caixa("Mario Gomes", "LLL.hhh.999-55", 950d, endereco);


        Gerente gerente = new Gerente();
        gerente.setNome("Alexander Cruz");
        gerente.setDocumento("999.999.999-99");
        gerente.setHorasTrabahadas(1144);
        gerente.setValorHora(150d);
        gerente.setEndereco(endereco);

        gerente.calcularRemuneracao();
        gerente.calculaBonificacao(30d);
        vendedor.calculaBonificacao(3d);
        vendedor1.calculaBonificacao(5d);
        vendedor2.calculaBonificacao(10d);


        System.out.println(vendedor);
        System.out.println(vendedor1);
        System.out.println(vendedor2);
        System.out.println(caixa);
        System.out.println(gerente);


    }
}
