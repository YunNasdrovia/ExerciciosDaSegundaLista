import java.util.Scanner;

public class Ex9 {

  public static void main(String[] ars) {

    Scanner scanner = new Scanner(System.in);
    Float kilos = scanner.nextFloat();
    float conver;
    scanner.close();
    conver = kilos * 1000;
    System.out.println("A soma é igual a:" + conver);

  }
}
