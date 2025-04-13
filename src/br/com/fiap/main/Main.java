package br.com.fiap.main;

// RM: 563770  Nome: Lucas Rossoni Dieder
// RM: 563748  Nome: Kelson Zhang
// Rm: 565554  Nome: Alexander Dennis Isidro Mamani

import br.com.fiap.bean.DespesaFamiliar;

import java.util.Scanner;

public class Main { // classe
    public static void main(String[] args) { // metodo
        double rendaFamiliar, gastoComLuz, gastoComAgua, gastoComInternet, valorMensalidade;
        int numeroDeMoradores;

        DespesaFamiliar despesa = new DespesaFamiliar(); // criando objeto que instancia da classe DespesaFamiliar
        Scanner scan;   // declaração do objeto da classe Scanner

        try {
            scan = new Scanner(System.in);

            System.out.print("Informe a sua renda familiar: ");
            rendaFamiliar = scan.nextDouble();
            despesa.rendaFamiliar = rendaFamiliar;

            System.out.print("Informe o número de moradores (sem contar você mesmo):  ");
            numeroDeMoradores = scan.nextInt();
            despesa.numeroDeMoradores = numeroDeMoradores;

            System.out.print("Informe o gasto de energia: ");
            gastoComLuz = scan.nextDouble();
            despesa.gastoComLuz = gastoComLuz;

            System.out.print("Informe o gasto de água: ");
            gastoComAgua = scan.nextDouble();
            despesa.gastoComAgua = gastoComAgua;

            System.out.print("Informe o gasto de internet: ");
            gastoComInternet = scan.nextDouble();
            despesa.gastoComInternet = gastoComInternet;

            System.out.print("Informe o valor mensal da academia: ");
            valorMensalidade = scan.nextDouble();
            despesa.valorMensalidadeDaAcademia = valorMensalidade;

            System.out.printf("Renda familiar: R$ %.3f \nTotal de Despesas: R$ %.3f \nRenda Liquida: R$ %.3f ", rendaFamiliar, despesa.calcularTotalDeDespesas(), despesa.calcularRendaFamiliarLiquida());

        } catch (Exception e) {
            System.out.println("Formato de número incorreto");
        }
    }
}
