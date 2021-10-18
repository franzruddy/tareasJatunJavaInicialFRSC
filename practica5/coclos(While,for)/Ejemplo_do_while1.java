
public class Ejemplo_do_while1{
    public String ejemplificar(int num){
        String res= "";
        do{
            res = res + num +" ";
            num = num/10;
        }while(num!=0);
        return res;
    }    
}
