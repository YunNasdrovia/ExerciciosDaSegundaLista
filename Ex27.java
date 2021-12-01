import java.util.Scanner;

public class Ex27 {

  public static void main(String[] ars) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o preco de fabrica do veiculo: ");
    float precoDeFabrica = scanner.nextFloat();
    System.out.println("Digite o percental de lucro do distribuidor: ");
    float percentualLucroDistribuidor = scanner.nextFloat();
    System.out.println("Digite o pecental de impostos: ");
    float perceImpostos = scanner.nextFloat();
    scanner.close();
    float lucroDistribuidor;
    float valorImpostos;
    float precoFinal;

    valorImpostos=( perceImpostos*precoDeFabrica )/100;
    lucroDistribuidor = (percentualLucroDistribuidor * ( precoDeFabrica - valorImpostos ))/100;
    precoFinal = precoDeFabrica + lucroDistribuidor - valorImpostos;
    
    System.out.println("O lucro do distribuidor e : " + lucroDistribuidor);
    System.out.println("O valor correspondente aos impostos  e : " + valorImpostos);
    System.out.println("O preco final do viculo e : " + precoFinal );

  }
}

