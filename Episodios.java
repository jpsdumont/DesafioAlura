package br.com.jops.ScreenMatch.modelos;

import Calculadora.Classisficavel;
import br.com.Serie;

public class Episodios implements Classisficavel {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalVisualizaçoes;
    
    
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Serie getSerie() {
        return serie;
    }
    public void setSerie(Serie serie) {
        this.serie = serie;
    }
    @Override
    public int getClassificação() {
        if( totalVisualizaçoes > 100){
            return 4;
        }else{
            return 2;
        }
    }
    public int getTotalVisualizaçoes() {
        return totalVisualizaçoes;
    }
    public void setTotalVisualizaçoes(int totalVisualizaçoes) {
        this.totalVisualizaçoes = totalVisualizaçoes;
    }


}
