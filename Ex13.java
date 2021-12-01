import java.util.Scanner;

public class Ex13 {

  public static void main(String[] ars) {

    Scanner scanner = new Scanner(System.in);
    int anoNascimento = scanner.nextInt();
    int anoAtual = scanner.nextInt();
    int idade, idadeFutura;
    scanner.close();
    idade = anoAtual - anoNascimento;
    idadeFutura = 2050 - anoNascimento;
    System.out.println("A sua idade e:" + idade);
    System.out.println("A sua idade em 2050 sera:" + idadeFutura);

  }
}
