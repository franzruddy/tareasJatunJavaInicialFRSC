public class Ejercicio8_comberLiteral
{
    public String combersorLiteral(int dia,int mes,int año){
        String res="";
        if(mes == 1){
            res = dia+" de Enero de "+año;
        }else if (mes == 2){
            res = dia+" de Febrero de "+año;
        }else if (mes == 3){
            res = dia+" de Marzo de "+año;
        }else if (mes == 4){
            res = dia+" de Abril de "+año;
        }else if (mes == 5){
            res = dia+" de Mayo de "+año;
        }else if (mes == 6){
            res = dia+" de Junio de "+año;
        }else if (mes == 7){
            res = dia+" de Julio de "+año;
        }else if (mes == 8){
            res = dia+" de Agosto de "+año;
        }else if (mes == 9){
            res = dia+" de Septiembre de "+año;
        }else if (mes == 10){
            res = dia+" de Octubre de "+año;
        }else if (mes == 11){
            res = dia+" de Noviembre de "+año;
        }else if (mes == 12){
            res = dia+" de Diciembre de "+año;
        }
        return res;
    }
}
