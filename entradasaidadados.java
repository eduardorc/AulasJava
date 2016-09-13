import java.util.Scanner;

public class entradasaidadados {
  public static void main (String[] args){
    System.out.println ("Informe a idade do cachorro: ");
    Scanner in = new Scanner(System.in);
    int idadecachorro = in.nextInt();
    idadecachorro = idadecachorro*7;

    System.out.println ("Idade Humana do Cachorro = "+idadecachorro+" anos");

  }
}
