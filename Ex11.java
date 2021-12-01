import java.util.Scanner;

public class Ex11 {

  public static void main(String[] ars) {

    Scanner scanner = new Scanner(System.in);
    float sal = scanner.nextFloat();
    float salMin = scanner.nextFloat();
    float qtdSalario;
    scanner.close();
    qtdSalario = (sal/ salMin);
    System.out.println("O seu salario e igual a:" + qtdSalario + "salarios minimos");

  }
}
