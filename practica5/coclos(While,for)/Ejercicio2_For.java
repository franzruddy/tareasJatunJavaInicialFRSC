public class Ejercicio2_For{
    public String verificarNumero(int numero){
        boolean esPrimo = true;
        String res=""; 
        //for(variableDeControlLocal;condicion(es);varacion){}
        for(int div=2;div<=(numero/2) && (esPrimo == true);div++){
            if(numero%div==0){
                esPrimo = false;                
            }
        }
        if (esPrimo == true){
            if(numero == 1){
                res = "El numero es Compuesto";
            }else{
                res = "El numero es Primo";
            }            
        }
        return res ;
    }
}