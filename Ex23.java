import java.util.Scanner;

public class Ex23 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o seu peso: ");
    float peso = scanner.nextFloat();
    scanner.close();
    float novoPeso;
    novoPeso = peso + (peso * 15) / 100;
    System.out.println("O novo peso se a pessoa engordar e : " + novoPeso);
    novoPeso = peso + (peso * 20) / 100;
    System.out.println("O novo peso se a pessoa emagrecer e : " + novoPeso);

  }
}
