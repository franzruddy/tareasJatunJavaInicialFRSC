import java.util.Scanner;
public class App
{
    public static void main(String arg[]){
        Capicua c1 = new Capicua();
        Scanner sc = new Scanner (System.in); //leer por teclado
        System.out.print("Ingrese el numero que quiere verificar ");
        int ent = sc.nextInt();
        String res = c1.verificar(ent);
        System.out.print(res);
    }
}
