import java.util.Scanner;

public class Ex25 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o valor que esta na conta: ");
    float valNaConta = scanner.nextFloat();
    System.out.println("Digite o valor do deposito: ");
    float valDeposito = sc.nextFloat();
    System.out.println("Digite o valor da taxa de juros: ");
    float valTaxaJuros = scanner.nextFloat();
    scanner.close();
    float rendimento, valTotal;
    rendimento = valDeposito - valTaxaJuros;
    valTotal = valNaConta + rendimento;
    System.out.println("O rendimento e de : " + rendimento);
    System.out.println("O valor total e de : " + valTotal);

  }
}
