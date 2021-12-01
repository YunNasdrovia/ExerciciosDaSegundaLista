import java.util.Scanner;

public class Ex21 {

  public static void main(String[] ars) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o salario base do funcionario: ");
    float salBase = scanner.nextFloat();
    float salAReceber;
    salarioaReceber = salBase + ((salBase * 5) / 100) - ((salBase * 7) / 100);
    scanner.close();
    System.out.println("O salario a receber e de: " + salAReceber);

  }
}
