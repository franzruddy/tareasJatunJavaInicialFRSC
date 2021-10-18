public class Ejercicio13_Numeros_Amigos{
    public String verificar(int numero1, int numero2){
        String res="";
        if(numero1!= numero2){
            int sumaDivisoresNum1= sumatorDivisores(numero1);
            int sumaDivisoresNum2= sumatorDivisores(numero2);
            if (numero1 == sumaDivisoresNum2 && sumaDivisoresNum1==numero2){
                res="Son amigos";
            }else{
                res="NO son amigos";
            }
        }else{
            res= "Los numeros son iguales, no se puede verificar";
        }
        return res;
    }
        
    private int sumatorDivisores(int numero){
        int res = 0;
        for(int div=1; div<numero;div++){ 
            if(numero%div == 0){    
                res = res+div;
            }
        }
        return res;
    }
}
