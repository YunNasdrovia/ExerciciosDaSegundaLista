import java.util.Scanner;

public class Ex20 {

  public static void main(String[] ars) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o custo do espetaculo teatral: ");
    float custoEspt = scanner.nextFloat();
    System.out.println("Digite o preço do convite: ");
    float preConvite = scanner.nextFloat();
    float qtdConvites;
    quantidadeConvites = custoEspt / preConvite;
    scanner.close();
    System.out.println("Para suprir as necessidades do espetaculo devem ser vendidos: " + qtdConvites);

  }
}
