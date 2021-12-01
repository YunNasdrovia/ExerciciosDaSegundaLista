import java.util.Scanner;

public class Ex8 {

  public static void main(String[] ars) {

    Scanner scanner = new Scanner(System.in);
    float l1 = scanner.nextFloat();
    float l2 = scanner.nextFloat();
    float area;
    scanner.close();
    area = l1 * l2;
    System.out.println("A area do quadrado é igual a:" + area);

  }
}
