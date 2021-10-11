
/**
 * Write a description of class ejemplos1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ejemplos1
{
         
    public static void main(String [] args){
    Scanner scanner=new Scanner(System.in);
    System.out.print("Ingrese un número: ");
    int n=scanner.nextInt();
    if((n/10>=10)&&(n/10<100)){
    System.out.print("Digito 3 está en el número leído\n");
    }else{
    System.out.print("Sólo está permitido número de 3 digitos\n");
    }
   }
}
