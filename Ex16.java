import java.util.Scanner;

public class Ex16 {

  public static void main(String[] ars) {

    Scanner scanner = new Scanner(System.in);
    float mediEmPes = scanner.nextFloat();
    scanner.close();

    System.out.println("A) O resultado e: " + mediEmPes * 12);
    System.out.println("B) O resultado e: " + mediEmPes / 6);
    System.out.println("C) O resultado e: " + mediEmPes / 1760);

  }
}
