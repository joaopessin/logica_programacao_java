package _25_logica_4_6;

import java.util.Scanner;

public class GastoFamiliar2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float somaTotalGastos = 0.0F;

        System.out.println("Informe os valores gastos com...\n");
        System.out.print("Conta de luz: ");
        float contaLuz = entrada.nextFloat();

        System.out.print("Conta de água: ");
        float contaAgua = entrada.nextFloat();

        System.out.print("Conta de telefone: ");
        float contaTelefone = entrada.nextFloat();

        System.out.print("Escola do filho: ");
        float escolaFilho = entrada.nextFloat();

        System.out.print("Fatura do cartão: ");
        float faturaCartao = entrada.nextFloat();

        System.out.print("Gasto no supermercado: ");
        float gastoSupermercado = entrada.nextFloat();

        somaTotalGastos += contaLuz;
        somaTotalGastos += contaAgua;
        somaTotalGastos += contaTelefone;
        somaTotalGastos += escolaFilho;
        somaTotalGastos += faturaCartao;
        somaTotalGastos += gastoSupermercado;

        System.out.println("\nGasto total: R$" + somaTotalGastos);

        entrada.close();
    }
}
