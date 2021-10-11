public class Ejercicio5_diferencianu
{
    public String comparar_multiplos(int numero1, int numero2){
        String res="";
        if((numero1%numero2==0) || (numero2%numero1==0)){
            res = "son parientes";
        }else{
            res = "no son parientes";
        }
        return res;
    }
}
