package br.com.jops;


import Calculadora.Classisficavel;
import br.com.jops.ScreenMatch.Titulo;

public class Filme extends Titulo implements Classisficavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    @Override
    public int getClassificação(){
        return (int) (pegaMedia()/ 2);
    }
    
    

}
