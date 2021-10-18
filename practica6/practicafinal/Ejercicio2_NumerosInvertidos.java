
public class Ejercicio2_NumerosInvertidos{
    public String invertir(int numero1, int numveces){
        String res="";
        int exp = cantDig(numero1)-1;
        int aux =(int)Math.pow(10,exp);
        for(int i=0; i<numveces; i++){
            int dig = numero1%10; //ultimo digito
            numero1 = numero1/10; //quitar el ultimo digito
            int ultNumPotenciado = aux*dig;   // (1000)*(1)  
            numero1 = numero1+ultNumPotenciado;
            res = res+numero1+"\n";
        }
        return res;
    }
    private int cantDig(int num){
        int res=0;
        while(num>0){
            res++;
            num=num/10;
        }
        return res;
    }
}
