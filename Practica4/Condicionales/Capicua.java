
public class Capicua
{
    public String verificar(int numero){
        String res= "";
        int ultiDig = numero%10;
        int primerDig = numero/100;
        if (ultiDig == primerDig){
            res = "Si es un numero Capicua";
        }else{
            res = "No es un numero Capicua";
        }
        return res;
    }
}
