import Calculadora.Calculos;
import Calculadora.FiltroRecomendacao;
import br.com.Serie;
import br.com.jops.Filme;
import br.com.jops.ScreenMatch.modelos.Episodios;

public class Principal {
    public static void main(String[] args) {
        Filme dadosFilme = new Filme();
        dadosFilme.setNome("O poderoso Chefão");
        dadosFilme.setAnoDeLançamento(1970);
        dadosFilme.setDuraçãoEmMinutos(180);
        dadosFilme.avalia(5);
        dadosFilme.avalia(4);
        dadosFilme.pegaMedia();
        dadosFilme.fichaTecnica();
        

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLançamento(2023);
        outroFilme.setDuraçãoEmMinutos(200);
        outroFilme.fichaTecnica();


        Serie serie = new Serie();
        serie.setNome("Lost");
        serie.setAnoDeLançamento(2000);
        serie.fichaTecnica();
        serie.setTemporadas(10);
        serie.setQntEpsodiosTemporada(10);
        serie.setMinutosPorEpisodios(50);
        System.out.println("Duração da serie é: "+ serie.getDuraçãoEmMinutos());

        Calculos dadosCalculos = new Calculos();
        dadosCalculos.inclui(dadosFilme);
        dadosCalculos.inclui(outroFilme);
        dadosCalculos.inclui(serie);
        System.out.println(dadosCalculos.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtro(dadosFilme); 
        
        Episodios dadosEp = new Episodios();
        dadosEp.setSerie(serie);
        dadosEp.setNumero(1);
        dadosEp.setTotalVisualizaçoes(300);


    }
}
