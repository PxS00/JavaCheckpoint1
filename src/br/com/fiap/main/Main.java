package br.com.fiap.main;

// RM: 563770  Nome: Lucas Rossoni Dieder
// RM: 563748  Nome: Kelson Zhang
// Rm: 565554  Nome: Alexander Dennis Isidro Mamani

import br.com.fiap.bean.DespesaFamiliar;

import java.util.Scanner;

public class Main { // classe
    public static void main(String[] args) { // metodo

        DespesaFamiliar despesa = new DespesaFamiliar(); // criando objeto que instancia da classe DespesaFamiliar
        Scanner scan;   // declaração do objeto da classe Scanner

        try {
            scan = new Scanner(System.in); // criando objeto que instancia Scanner
            System.out.print("Informe a sua renda familiar: ");
            despesa.rendaFamiliar = scan.nextDouble();

            System.out.print("Informe o número de moradores (sem contar você mesmo):  ");
            despesa.numeroDeMoradores = scan.nextInt();

            System.out.print("Informe o gasto de energia: ");
            despesa.gastoComLuz = scan.nextDouble();

            System.out.print("Informe o gasto de água: ");
            despesa.gastoComAgua = scan.nextDouble();

            System.out.print("Informe o gasto de internet: ");
            despesa.gastoComInternet = scan.nextDouble();

            System.out.print("Informe o valor mensal da academia: ");
            despesa.valorMensalidadeDaAcademia = scan.nextDouble();

            System.out.printf("Renda familiar: R$ %.3f \nTotal de Despesas: R$ %.3f \nRenda Liquida: R$ %.3f ", despesa.rendaFamiliar, despesa.calcularTotalDeDespesas(), despesa.calcularRendaFamiliarLiquida());

        } catch (Exception e) {
            System.out.println("Formato de número incorreto");
        }
    }
}
