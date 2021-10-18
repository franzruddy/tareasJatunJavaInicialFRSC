

public class Ejercicio14_Num_sonNovios{
    public String verificar(int numero1, int numero2){
        String res="";
        if(numero1!= numero2){
            int sumaDivisoresNum1= sumatorDivisores(numero1)-1;
            int sumaDivisoresNum2= sumatorDivisores(numero2)-1;
            if (numero1 == sumaDivisoresNum2 && sumaDivisoresNum1==numero2){
                res="Son Novios";
            }else{
                res="NO pasa nada";
            }
        }else{
            res= "Los numeros son iguales, no se puede verificar";
        }
        return res;
    }

    private int sumatorDivisores(int numero){ 
        int res = 0;
        for(int div=1; div<numero;div++){ //sacar reciduo mio menos el numero
            if(numero%div == 0){    
                res = res+div;
            }
        }
        return res;
    }
}
