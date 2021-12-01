import java.util.Scanner;

public class Ex26 {

  public static void main(String[] ars) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um numero: ");
    int numero = scanner.nextInt();
    scanner.close();
    System.out.println("O numero digitado ao quadrado e : " + Math.pow(numero, 2));
    System.out.println("O numero digitado ao cubo e : " + Math.pow(numero, 3));
    System.out.println("A raiz quadrada do numero digitado e : " + Math.sqrt(numero));

  }
}
