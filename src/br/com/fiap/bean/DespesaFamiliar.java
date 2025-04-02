package br.com.fiap.bean;

// RM: 563770  Nome: Lucas Rossoni Dieder
// RM: 563748  Nome: Kelson Zhang
// Rm: 565554  Nome: Alexander Dennis Isidro Mamani

public class DespesaFamiliar {  // Classe
    // atributos
    public double rendaFamiliar;    // bruto
    public int numeroDeMoradores;   // total de pessoas que vivem
    public double gastoComLuz;
    public double gastoComAgua;
    public double gastoComInternet;
    public double valorMensalidadeDaAcademia;

    // métodos
    public double calcularTotalDeDespesas(){
        double gastos1, gastos2, totalDeDespesas;
        gastos1 = gastoComLuz + gastoComAgua + gastoComInternet;
        gastos2 = valorMensalidadeDaAcademia * (numeroDeMoradores + 1); // total de pessoas que vivem + mais aquele que diz
        totalDeDespesas = gastos1 + gastos2;
        return totalDeDespesas;
    }
    public double calcularRendaFamiliarLiquida(){
        double rendaFamiliarLiquida;
        rendaFamiliarLiquida = rendaFamiliar - calcularTotalDeDespesas();
        return rendaFamiliarLiquida;
    }
}
