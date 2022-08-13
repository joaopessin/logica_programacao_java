package _15_java_2;

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

        if(multaCarro) {
            System.out.println();
        }
    }
}
