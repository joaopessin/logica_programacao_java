package _25_logica_4_6;

import java.util.Scanner;

public class GastoFamiliar2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o valor da conta de luz: ");
        float contaLuz = entrada.nextFloat();

        System.out.print("Informe o valor da conta de água: ");
        float contaAgua = entrada.nextFloat();

        System.out.print("Informe o valor da conta de telefone: ");
        float contaTelefone = entrada.nextFloat();

        System.out.print("Informe o valor da escola do filho: ");
        float escolaFilho = entrada.nextFloat();

        System.out.print("Informe o valor da fatura do cartão: ");
        float faturaCartao = entrada.nextFloat();

        System.out.print("Informe o valor gasto no supermercado: ");
        float gastoSupermercado = entrada.nextFloat();

        float somaTotalGastos = 0.0F;

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
