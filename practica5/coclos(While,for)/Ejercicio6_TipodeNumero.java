public class Ejercicio6_TipodeNumero
{
    public String verificarTipo(int numero){
        String res ="";
        int sumatoriaDiv = calcularSumatoriaDiv(numero);
        if (sumatoriaDiv==numero){
            res = "numero Perfecto";
        }else{
            if(sumatoriaDiv>numero){
                res = "Numero Abundante";
            }else{
                res = "Numero Defectivo";
            }
        }
        return res;
    }

    private int calcularSumatoriaDiv(int num){
        int res = 0;
        for(int div = 1; div<=(num/2);div++){
            if(num%div ==0){
                res = res + div;
            }
        }
        return res;
    }
}
