public class Ejercicio7_Multiplos
{
    public String multiplos_Pelea(int poder, int putos_Vida){
        String res = "";
        if (putos_Vida%poder==0){
            res ="Si";
        }else{
            res ="No";
        }
        return res;
    }
}
