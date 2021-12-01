import java.util.Scanner;

public class Ex15 {

  public static void main(String[] ars) {

    Scanner scanner = new Scanner(System.in);
    int primNum = scanner.nextInt();
    int segNum = scanner.nextInt();
    scanner.close();

    System.out.println("O resultado e: " + Math.pow(primNum, segNum));

  }
}
