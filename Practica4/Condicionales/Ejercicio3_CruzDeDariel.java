public class Ejercicio3_CruzDeDariel
{
    public String comparar_num(int nuevoDia){
        String respuesta = "";
        int ultiDig = nuevoDia%10;
        int primerDig = nuevoDia/10;
        if(primerDig%2==0 && ultiDig%2!=0){
            respuesta = "Cruz de Dariel";
        }else{
            if (primerDig%2!=0 && ultiDig%2==0){
                respuesta = "Cruz de Dariel";
            }else{
                respuesta = "Día normal";
            }
        }
        return respuesta;       
    } 
    public String verificarDia(int dia){
        String res="";
        if (dia<10){
            res ="Es un dia Normal";
        }else{
            int dig1 = dia%10;
            int dig2 = dia/10;
            if((dig1%2 == 0 && dig2%2 ==0)||(dig1%2 !=0 && dig2%2 !=0)){
                res="Es un dia Normal";
            }else{
                res="Crus de dariel";
            }
        }
        return res;
    }
}
