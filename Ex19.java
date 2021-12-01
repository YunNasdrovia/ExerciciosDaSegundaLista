import java.util.Scanner;

public class Ex19 {

  public static void main(String[] ars) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o seu salario: ");
    float sal = scanner.nextFloat();
    System.out.println("Digite o percentual de aumento: ");
    int percDeAumento = scanner.nextInt();
    float valorAumento, novoSalairo;
    scanner.close();
    valorAumento = (sal * percDeAumento) / 100;
    novoSalairo = sal + valorAumento;
    System.out.println("O valor de aumeto e: " + valorAumento);
    System.out.println("O novo salario e: " + novoSalairo);

  }
}
