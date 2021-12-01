import java.util.Scanner;

public class Exe31 {

  public static void main(String[] ars) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o valor do salario minimo: ");
    float salarioMinimo = scanner.nextFloat();
    System.out.println("Digite a quantidade de quilowatts consumidos por uma residencia: ");
    float qtQuilowatts = scanner.nextFloat();

    scanner.close();
    float valoquilowatts;
    float valoApagar;
    float valoApagar2;
    valoquilowatts = salarioMinimo / 5;
    valoApagar = qtQuilowatts * valoquilowatts;
    valoApagar2 = valoApagar - (valoApagar * 5) / 100;
    System.out.println("O valor de cada quilowatt e : " + valoquilowatts);
    System.out.println("O valor a ser pagar pela residencia e : " + valoApagar);
    System.out.println("O valor a ser pagar com 5% e : " + valoApagar2);

  }
}
