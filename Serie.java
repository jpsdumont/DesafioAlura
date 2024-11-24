package br.com;

import br.com.jops.ScreenMatch.Titulo;

public class Serie extends Titulo {
    private int temporadas;
    private boolean ativa;
    private int qntEpsodiosTemporada;
    private int minutosPorEpisodios;
    public int getTemporadas() {
        return temporadas;
    }
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    public boolean isAtiva() {
        return ativa;
    }
    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
    public int getQntEpsodiosTemporada() {
        return qntEpsodiosTemporada;
    }
    public void setQntEpsodiosTemporada(int qntEpsodiosTemporada) {
        this.qntEpsodiosTemporada = qntEpsodiosTemporada;
    }
    public int getMinutosPorEpisodios() {
        return minutosPorEpisodios;
    }
    public void setMinutosPorEpisodios(int minutosPorEpisodios) {
        this.minutosPorEpisodios = minutosPorEpisodios;
    }
    @Override
    public int getDuraçãoEmMinutos(){
        return temporadas*minutosPorEpisodios*qntEpsodiosTemporada;
    }



}
