public class Ejercicio6_Edades
{
    public String calcualoEdades(String nombreS1, int anioN1, 
    String nombreS2, int anioN2, String nombreS3, int anioN3){
        String herMayor="";
        String herMedio="";
        String herMenor="";
        String resMayor="";
        String resMedio="";
        String resMenor="";

        if(anioN1>anioN2 && anioN1>anioN3){
            herMayor = "Con "+anioN1+" años, El hermano mayor es: " +nombreS1;
            resMayor = herMayor;
        }else{
            if(anioN2>anioN1 && anioN2>anioN3){
                herMayor = "Con "+anioN2+" años, El hermano mayor es: " +nombreS2;
                resMayor = herMayor;
            }else{
                herMayor = "Con "+anioN3+" años, El hermano mayor es: " +nombreS3; 
                resMayor = herMayor;
            }
        }
        if(anioN1<anioN2 && anioN1<anioN3){
            herMenor = "Con "+anioN1+" años, El hermano menor es: " +nombreS1;
            resMenor = herMenor;
        }else{
            if(anioN2<anioN1 && anioN2<anioN3){
                herMenor = "Con "+anioN2+" años, El hermano menor es: " +nombreS2;
                resMenor = herMenor;
            }else{
                herMenor = "Con "+anioN3+" años, El hermano menor es: " +nombreS3; 
                resMenor = herMenor;
            }
        }
        if((anioN1>anioN2 && anioN1<anioN3)||(anioN1<anioN2 && anioN1>anioN3)){
            herMedio = "Con "+anioN1+" años, El hermano medio es: " +nombreS1;
            resMedio = herMedio;
        }else{
            if((anioN2>anioN1 && anioN2<anioN3)||(anioN2<anioN1 && anioN2>anioN3)){
                herMedio = "Con "+anioN2+" años, El hermano medio es: " +nombreS2;
                resMedio = herMedio;
            }else{
                if((anioN3>anioN1 && anioN3<anioN2)||(anioN3<anioN1 && anioN3>anioN2)){
                herMedio = "Con "+anioN3+" años, El hermano medio es: " +nombreS3; 
                resMedio = herMedio;
                }
            }
        } 
        String res=resMayor+"  _  "+resMedio+"  _  "+resMenor;
        return res;
    }
}
