public class Ejercicio9_AñoBisiesto
{
    public String identificacionBisiesto(int año){
        String res="";
        if((año%4==0)&&((año%100!=0)||(año%400==0))){
            res = "Es Bisiesto";
        }else{
            res = "NO es Bisiesto";
        }
        return res;
    }
}
