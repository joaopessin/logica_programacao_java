package logica_programacao_java;

import java.util.Scanner;

public class MultaVeiculo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int velocidadeMaxima = 0, velocidadeVeiculo = 0;

        System.out.println("\"Departamento de Trânsito e Transporte\"\n");
        System.out.println("Escolha o veículo: \n1. Carro \n2. Caminhão");

        System.out.print("\nOpção: ");
        int tipoVeiculo = sc.nextInt();

        System.out.print("\nInforme a velocidade máxima permitida: ");
        velocidadeMaxima = sc.nextInt();

        System.out.print("Valocidade do veículo: ");
        velocidadeVeiculo = sc.nextInt();

        int carroAcimaVelocidade = velocidadeMaxima + ((velocidadeMaxima / 100) * 10);
        int caminhaoAcimaLimite = velocidadeMaxima + ((velocidadeMaxima / 100) * 5);

        boolean multaCarro = velocidadeVeiculo > carroAcimaVelocidade;
        boolean multaCaminhao = velocidadeVeiculo > caminhaoAcimaLimite;

        if(tipoVeiculo == 1 && multaCarro) {
            int valorMulta = 5 * (velocidadeVeiculo - carroAcimaVelocidade);

            System.out.println("\nVeículo multado! Valor da taxa: R$" + valorMulta);
        } else if(tipoVeiculo == 2 && multaCaminhao) {
            int valorMulta = 10 * (velocidadeVeiculo - caminhaoAcimaLimite);

            System.out.println("\nVeículo multado! Valor da taxa: R$" + valorMulta);
        } else if(tipoVeiculo == 1 || tipoVeiculo == 2) {
            System.out.println("\nVeículo dentro do limite!");
        } else {
            System.out.println("\nValor inválido!");
        }
    }
}
