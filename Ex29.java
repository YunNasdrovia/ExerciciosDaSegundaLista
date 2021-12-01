import java.util.Scanner;

public class Ex29 {

  public static void main(String[] ars) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o saldo da sua conta: ");
    float saldoConta = scanner.nextFloat();
    System.out.println("Digite o valor do primeiro cheque: ");
    float cheque1 = scanner.nextFloat();
    System.out.println("Digite o valor do segundo cheque: ");
    float cheque2 = scanner.nextFloat();
    sc.close();

    double saldoActual;
    double cpmf1;
    double cpmf2;
    cpmf1 = (0.38 * cheque1) / 100;
    cpmf2 = (0.38 * cheque1) / 100;
    saldoActual = saldoConta - cheque1 - cpmf1 - cheque2 - cpmf2;

    System.out.println("O saldo actual e : " + saldoActual);

  }
}
