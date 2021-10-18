public class Ejercicio3_binario_decimal{
    public int convertirBinario_Decimal(int numBinario){
        int num_decimal = 0;
        int base = 2;
        int exp=0;
        while(numBinario>0){
            int digitos = numBinario%10;
            num_decimal = num_decimal+(digitos*(int)Math.pow(base,exp));
            exp++;
            numBinario = numBinario/10;
        }
        return num_decimal;
    }
}
