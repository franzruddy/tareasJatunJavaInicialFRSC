public class Ejercicio10_numerosenCrecimiento
{
    public String nun_crecimiento(int numNuevo){
        String res="";
        int digito1 = numNuevo/100;
        int aux = numNuevo%100;
        int digito2 = aux/10;
        int digito3 = numNuevo%10;
        if(digito1<=digito2 && digito2<=digito3 ){
            res ="Es un numero en Crecimiento";
        }else{
            res ="No esta en crecimieno";
        }
        return res ;
    }
}
