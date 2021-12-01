import java.util.Scanner;

public class Ex28 {

  public static void main(String[] ars) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o numero de horas trabalhadas: ");
    int numeroHorasTrabalhadas = scanner.nextInt();
    System.out.println("Digite o valor do salario minimo: ");
    float salMinimo = scanner.nextFloat();
    scanner.close();

    float valorHoraTrabalahada;
    float salarioBruto;
    float imposto;
    float salarioReceber;

    valorHoraTrabalahada = salMinimo / 2;
    salarioBruto = numeroHorasTrabalhadas * valorHoraTrabalahada;
    imposto = (3 * salarioBruto) / 100;
    salarioReceber = salarioBruto - imposto;

    System.out.println("O salario a rebeceber e : " + salarioReceber);

  }
}
