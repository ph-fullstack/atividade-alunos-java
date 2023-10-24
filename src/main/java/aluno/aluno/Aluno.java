package aluno;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@Data
public class Aluno {
  @NonNull private int matricula;
  @NonNull private String nome;
  @NonNull private double nota1;
  @NonNull private double nota2;

  public void status() {
    System.out.println(this.toString());
    double media = this.calcularMedia();
    System.out.printf("Média: %2f\n", media);
    String resultado = (media >= 7) ? "APROVADO" : "REPROVADO";
    System.out.printf("Resultado: %s", resultado);
  }

  public double calcularMedia() {
    double media = (this.nota1 + this.nota2) / 2;
    return media;
  }
}
