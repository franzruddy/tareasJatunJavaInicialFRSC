public class Ejercicio1_Num_Draconico{
    
    public String verificar_Num_Draco(int numero){
        String res = "";
        int dig_Sum_Par = sumaDigitos_p(numero);
        int dig_Sum_Impar = sumaDigitos_Intp(numero);
        if(dig_Sum_Par==dig_Sum_Impar){
            res="Numero Draconico";
        }else{
            res="Numero Normal";
        }
        return res;
    }
        
    private int sumaDigitos_p(int num){
        int par = 0;       
        while(num>0){
            int digito = num%10;
            if(digito%2==0){
                par=  par + digito;
            }
            num = num/10;
        } 
        return par;
    }
    
    private int sumaDigitos_Intp(int num){
        int intp = 0;       
        while(num>0){
            int digito = num%10;
            if(digito%2!=0){
                intp=  intp + digito;
            }
            num = num/10;
        } 
        return intp;
    }
}
