/**
 * Este es un ejemplo para el manejo de BlueJ 
 * 
 * @author (Franz Ruddy Salinas Cespedes) 
 * @version 
 */
import java.util.*;

public class Ejercicio3_Circunferencia
{
    public float calcularCircunferencia (float radio){
        float respuesta = (radio*2)*(float)(3.14159); // o 3.4f;
        return respuesta;
    }    
    public double calcular (int radio){
        double respuesta =0;
        double pi = 3.14159;
        int diametro = radio*2;
        respuesta = diametro*pi;
        return respuesta;
    }
        
}
