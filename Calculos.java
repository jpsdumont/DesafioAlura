package Calculadora;

import br.com.jops.ScreenMatch.Titulo;

public class Calculos {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }
    public void inclui(Titulo t){
        this.tempoTotal += t.getDuraçãoEmMinutos();
    }



   
}
