import java.util.Scanner;

public class Ex18 {

  public static void main(String[] ars) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o preco do produto: ");
    float preProduto = scanner.nextFloat();
    float novoPreProduto;
    novoPrecoProduto = preProduto - (preProduto * 10) / 100;
    scanner.close();

    System.out.println("O Prco do produto com desconto e: " + novoPreProduto);

  }
}
