import java.util.Scanner;

public class decisao {
  public static void main (String[] args){
    //Utilização do IF - igual em C
    /* if (condição){
          faça isso;
       }
       else{
       faça esse outro;
     }
  */
    System.out.println("Digite um CPF: ");
    Scanner in = new Scanner(System.in);
    long cpf1 = in.nextLong();
    System.out.println("Digite novamente o CPF: ");
    long cpf2 = in.nextLong();
    if (cpf1 == cpf2){
      System.out.println ("CPF digitado corretamente.");
    }
    else{
      System.out.println ("CPF's não condizem.");
    }
  }
}
