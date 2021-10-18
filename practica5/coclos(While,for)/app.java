import java.util.Scanner;
public class app
{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        Ejemplo_Ejercicio_Fecha ej1 = new Ejemplo_Ejercicio_Fecha();
        System.out.println("Ingrese la fecha en este formato dd/mm/aa");
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int year = sc.nextInt();
        String res = ej1.formatoFecha(dia,mes,year);
        System.out.println(res);
    }
}
