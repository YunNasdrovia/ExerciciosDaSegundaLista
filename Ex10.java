import java.util.Scanner;

public class Ex10 {

  public static void main(String[] ars) {

    Scanner scanner = new Scanner(System.in);
    float baseMai = scanner.nextFloat();
    float baseMen = scanner.nextFloat();
    float alt = scanner.nextFloat();
    float area;
    scanner.close();
    area = ((baseMai + baseMen) * alt) / 2;
    System.out.println("A area é igual a:" + area);

  }
}
