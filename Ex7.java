import java.util.Scanner;

public class Ex7 {

  public static void main(String[] ars) {

    Scanner scanner = new Scanner(System.in);
    float ladoMai = scanner.nextFloat();
    float ladoMen = scanner.nextFloat();
    float area;
    scanner.close();
    area = (ladoMai * ladoMen) / 2;
    System.out.println("A area do losango é igual a:" + area);

  }
}
