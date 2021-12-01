import java.util.Scanner;

public class Ex14 {

  public static void main(String[] ars) {

    Scanner scanner = new Scanner(System.in);
    int anoNascimento = scanner.nextInt();
    int anoAtual = scanner.nextInt();
    int idade;
    scanner.close();
    idade = anoAtual - anoNascimento;
    System.out.println("A sua idade e:" + idade);
    System.out.println("A sua idade em meses: " + idade * 12);
    System.out.println("A sua idade em dias: " + idade * 365);
    System.out.println("A sua idade em semanas: " + idade * 52);

  }
}
