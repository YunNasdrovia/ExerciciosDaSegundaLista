import java.util.Scanner;

public class Ex17 {

  public static void main(String[] ars) {

    Scanner scanner = new Scanner(System.in);
    float salFuncionario = scanner.nextInt();
    float novoSalFuncionario;
    novoSalFuncionario = salFuncionario + (salFuncionario * 25) / 100;
    scanner.close();
    System.out.println("O seu novo salario e: " + novoSalFuncionario);

  }
}
