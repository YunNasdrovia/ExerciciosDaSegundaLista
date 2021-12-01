import java.util.Scanner;

public class Ex6 {

  public static void main(String[] ars) {

    Scanner scanner = new Scanner(System.in);
    float num1 = scanner.nextFloat();
    float num2 = scanner.nextFloat();
    float num3 = scanner.nextFloat();
    int p1 = scanner.nextInt();
    int p2= scanner.nextInt();
    int p3= scanner.nextInt();

    float mediap;
    scanner.close();
    mediap = (num1*p1+num2*p2+num3*p3)/(p1+p2+p3);
    System.out.println("A media ponderada  é igual a:" + mediap);


  }
}
