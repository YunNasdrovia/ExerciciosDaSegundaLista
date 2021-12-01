import java.util.Scanner;

public class Exe30 {

  public static void main(String[] ars) {

    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite o peso do saco de racao: ");
    float pesSaco = scanner.nextFloat();
    System.out.println("Digite a quantidade de racao para o primeiro gato: ");
    float gato1 = scanner.nextFloat();
    System.out.println("Digite a quantidade de racao para o primeiro gato: ");
    float gato2 = scanner.nextFloat();

    scanner.close();

    float qtdRacaoSaco;
    qtdRacaoSaco = pesSaco - 5 * (gato1 / 1000 + gato2 / 1000);

    System.out.println("Apos 5 dias restara nosaco : " + qtdRacaoSaco + " quilos de racao ");

  }
}
