public class Ejercicio3_InvertirNumero1{
    public int invertirNumero(int numero){
        int exp = contarDigitos(numero)-1;
        int mult = (int)(Math.pow(10, exp));
        int res = 0;
        while(numero>0){
            int dig = numero%10;
            res = res +(dig*mult);
            numero=numero/10;
            mult = mult/10;        
        }
        return res;
    }
    // valor concreto 40
    private int contarDigitos(int num){
        int res=0;
        if(num==0){
            res=1;
        }else{
            while(num !=0){
                num =num/10;
                res++;
            }
        }
        return res;
    } 
}
