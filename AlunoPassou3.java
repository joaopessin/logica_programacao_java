package _12_logica_3_8;

import java.util.Scanner;

public class AlunoPassou {
    static final Float NOTA_APROVACAO = 70.0F;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Agora, informe a segunda nota: ");
        double nota2 = sc.nextDouble();

        double somaNotas = nota1 + nota2;
        double quantidadeNotas = 2;
        double mediaNotas = somaNotas / quantidadeNotas;

        boolean alunoAprovado = mediaNotas >= NOTA_APROVACAO;

        System.out.println("\nMédia do aluno: " + mediaNotas);

        if(alunoAprovado) {
            System.out.println("Aluno aprovado com sucesso!");
        } else {
            System.out.println("Aluno reprovado!");
        }
    }
}
