/**
 * Este es un ejemplo para el manejo de BlueJ 
 * 
 * @author (Franz Ruddy Salinas Cespedes) 
 * @version 
 */
public class Ejercicio5_OrganizadordeNumeros
{
    public String modificarNumeros(int numero1,int numero2, int numero3){
        String respuesta= "";
        int aux = numero1;
        numero1 = numero2;
        numero2 = aux;
        aux = numero2;
        numero2 = numero3;
        numero3 = aux;
        respuesta =  numero1+""+numero2+""+numero3;
        return respuesta;
    }   
    public int formarNumero(int a,int b, int c){
        int respuesta = (b*100)+(c*10)+a;
        return respuesta;
        
    }
        
}
