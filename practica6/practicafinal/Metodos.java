public class Metodos{
    public int sumaDigitos(int num){
        int res = 0;
        while(num>0){
            int digito = num%10;
            res =  res + digito;
            num = num/10;
        } 
        return res;
    }
    
    public int sumaDigitos_p(int num){
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
    
    public int sumaDigitos_Intp(int num){
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
    public int contadorDigitos(int num){
        int res=0;
        while(num>0){
            res++;
            num=num/10;
        }
        return res;
    }
    
    public int invertir (int numero){
        int res = 0;
        while (numero>0){
            int dig =numero%10;
            res=(res*10)+dig;
            numero = numero/10;
        }
        return res;
    }
    
    
    
}
