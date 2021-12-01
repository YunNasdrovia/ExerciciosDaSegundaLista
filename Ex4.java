import java.util.Scanner;

public class Ex4 {

  public static void main(String[] ars) {

    Scanner scanner = new Scanner(System.in);
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();
    int divisao;
    scanner.close();
    divisao = num1/num2;
    System.out.println("A soma é igual a:" + divisao);

  }
}
