package br.com.jops.ScreenMatch;

public class Titulo {
    private String nome;
    private int anoDeLançamento;
    private boolean incluidoNoPlano;
    private double somaAvaliação;
    private int totalDeAvaliações;
    private int duraçãoEmMinutos;

    public int getTotalDeAvaliações(){
        return totalDeAvaliações;
    }
    
  
    public String getNome() {
        return this.nome;
    }


    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }


    public int getDuraçãoEmMinutos() {
        return duraçãoEmMinutos;
    }


    public void setAnoDeLançamento(int anoDeLançamento) {
        this.anoDeLançamento = anoDeLançamento;
    }


    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }


    public void setSomaAvaliação(double somaAvaliação) {
        this.somaAvaliação = somaAvaliação;
    }


    public void setTotalDeAvaliações(int totalDeAvaliações) {
        this.totalDeAvaliações = totalDeAvaliações;
    }


    public void setDuraçãoEmMinutos(int duraçãoEmMinutos) {
        this.duraçãoEmMinutos = duraçãoEmMinutos;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public void fichaTecnica(){
       if(nome == "Lost") {
        System.out.println("A série é: "+nome);
        System.out.println("O ano de lançamento é: "+anoDeLançamento);
       } else {
        System.out.println("O filme é: " +nome);
        System.out.println("O ano de lançamento é: "+anoDeLançamento);
       }
    }
    public void avalia(double nota){
        somaAvaliação += nota;
        totalDeAvaliações++;  
    }
    public double pegaMedia(){
        return somaAvaliação/totalDeAvaliações;
    }


}
