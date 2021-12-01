import java.util.Scanner;

public class Ex22 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o salario fixo do funcionario: ");
    float salFixo = scanner.nextFloat();
    System.out.println("Digite o valor das suas vendas: ");
    float valorVendas = scanner.nextFloat();
    float comissao, salFinal;
    comissao = (valorVendas * 4) / 100;
    salarioFinal = salFixo + comissao;
    sc.close();
    System.out.println("O Valor da comissao e de: " + comissao);
    System.out.println("O seu salario final e de: " + salFinal);

  }
}
