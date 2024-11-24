package Calculadora;

public class FiltroRecomendacao {
    public void filtro( Classisficavel classificavel){
        if(classificavel.getClassificação() >=4){
            System.out.println("Esta entre os preferidos do momento!");
        }else if (classificavel.getClassificação() >=2) {
            System.out.println("Filme recomendado!");
        }else{
            System.out.println("Coloque na sua lista!");
        }
    }
    

}
