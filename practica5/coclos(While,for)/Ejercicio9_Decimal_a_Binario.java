public class Ejercicio9_Decimal_a_Binario{
    public double conversorDecimal (int numDecimal){
        double binario=0;
        int digito;
        int exp =0;        
        while(numDecimal>0){
            digito=(numDecimal%2);
            binario=binario+(digito*Math.pow(10, exp));
            exp++;
            numDecimal=numDecimal/2;

        }
        return binario;
    }

    public int convercionDecimal_Binario(int numero){
        int binario =0;
        int base = 10;
        int exp = 0;
        while(numero>0){
            int digBin=(numero%2);
            binario=(digBin*(int)Math.pow(base, exp))+binario;
            exp++;
            numero=numero/2;

        }
        return binario;
    }
    
    public int transformar(int num){
        int res =0;
        int mult = 1;
        while(num>0){
            int residuo=num%2;
            res = res+ (residuo*mult);
            num = num/2;
            mult=mult*10;
        }
        return res;
    }
    
    public int transformarFor(int num){
        int res =0;
        int mult = 1;
        for(int numero=num ; numero>0 ; numero=numero/2){
            int residuo=numero%2;
            res = res+ (residuo*mult);
            mult=mult*10;
        }
        return res;
    }
}