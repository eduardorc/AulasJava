import java.util.Scanner;

public class calculadora{
  public static void main (String[] args){
    int resI;
    double resD;
    System.out.println ("\t--- Calculadora 2.0 ---");
    System.out.println ("Escolha a operação que deseja realizar:");
    System.out.println ("1 - Soma\n2 - Subtracao\n3 - Multiplicacao\n4 - Divisao");
    Scanner in = new Scanner(System.in);
    int decisao = in.nextInt();
    System.out.println("Agora digite dois numeros separados por um espaço: ");
    int num1, num2;
    num1 = in.nextInt(); num2 = in.nextInt();
    if (decisao == 1){
      resI = num1+num2;
      System.out.println("\nSoma = "+resI);
    }
    if (decisao == 2){
      resI = num1-num2;
      System.out.println("\nSubtracao = "+resI);
    }
    if (decisao == 3){
      resD = num1*num2;
      System.out.println("\nMult = "+resD);
    }
    if (decisao == 4){
      resD = num1/num2;
      System.out.println("\nDiv = "+resD);
    }

  }
}
