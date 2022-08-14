package _11_java_2;

import java.util.Scanner;

public class alunoPassou {
    public static void main(String[] args) {
        // Saber se o aluno passou de ano.
        Scanner sc = new Scanner(System.in);

        // Receber nota do aluno.
        System.out.print("Informe sua nota: ");
        double notaAluno = sc.nextDouble();

        // Checar se aluno passou.
        boolean alunoAprovado = notaAluno >= 70;

        // Imprimir resultado.
        if(alunoAprovado) {
            System.out.println("Aluno aprovado com sucesso!");
        } else {
            System.out.println("Aluno reprovado!");
        }
    }
}
