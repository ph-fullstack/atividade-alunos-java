package aluno;

import aluno.Aluno;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
      Aluno[] alunos = new Aluno[4];
      Scanner scanner = new Scanner(System.in);

      for (int i = 0; i < alunos.length; i++) {
        System.out.printf("----- %d° Aluno(a) -----\n", (i+1));
        System.out.print("Matrícula: ");
        int matricula = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Primeira nota: ");
        double nota1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Segunda nota: ");
        double nota2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println();

        alunos[i] = new Aluno(matricula, nome, nota1, nota2);
      }

      scanner.close();
      for (Aluno aluno : alunos) {
        aluno.status();
        System.out.print("\n\n");
      }
    }
}
