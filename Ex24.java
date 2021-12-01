import java.util.Scanner;

public class Ex24 {

  public static void main(String[] ars) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o seu salario base: ");
    float salBase = scanner.nextFloat();
    scanner.close();
    float salAReceber;
    salAReceber = salBase + 50 - (salBase * 10) / 100;
    System.out.println("O Salario a receber e de : " + salAReceber);

  }
}
