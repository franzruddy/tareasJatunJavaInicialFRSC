import java.util.Scanner;
public class Ejemplo_do_while2{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.println("Ingrese un numero mayor o igual a cero");
            num = sc.nextInt();
        }while(num<0);
        System.out.print("El valor del numero, es correcto");
    }
}
