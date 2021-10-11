
public class Ejercicio_Fecha
{
    public String formatoFecha(int mes){
        String mesLiteral= "";
        switch(mes){
            case 1: 
                mesLiteral = "Enero"; 
                break;
            case 2: 
                mesLiteral = "Febrero";
                break;
            case 3: 
                mesLiteral = "Marzo";
                break;
            case 4: 
                mesLiteral = "Abril";
                break;
            case 5: 
                mesLiteral = "Mayo";
                break;
            case 6: 
                mesLiteral = "Junio";
                break;
            case 7: 
                mesLiteral = "Julio";
                break;
            case 8: 
                mesLiteral = "Agosto";
                break;
            case 9: 
                mesLiteral = "Septiembre";
                break;
            case 10: 
                mesLiteral = "Octubre";
                break;
            case 11: 
                mesLiteral = "Noviembre";
                break;
            case 12: 
                mesLiteral = "Diciembre";
                break;
            default: mesLiteral = "Dato de entrada no valido";

        } 
        return mesLiteral;
    } 
}
