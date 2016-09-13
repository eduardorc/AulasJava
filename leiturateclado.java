import java.util.Scanner; // IMPORTAR BIBLIOTECA SCANNER
/* Caso eu quisesse importar TUDO do java.util:
import java.util.*;
*/

public class leiturateclado{
  public static void main (String[] args){
    String texto;
    System.out.println ("Digite um numero: ");
    Scanner in = new Scanner (System.in);//Cria-se um novo objeto de Scanner
    texto = in.nextLine();//vai ler até que o usuário dê enter
    System.out.println ("Seu texto foi: "+texto);
  }
}
