import java.util.Scanner;

public class Ex5 {

  public static void main(String[] ars) {

    Scanner scanner = new Scanner(System.in);
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();
    int num3 = scanner.nextInt();
    int media;
    scanner.close();
    media = (num1 + num2 + num3) / 3;
    System.out.println("A media é igual a:" + media);

  }
}
