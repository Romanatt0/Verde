package Repositorios;

import Classes.AreaVerde;
import Classes.Avaliacao;

import java.util.ArrayList;

public class AvaliacaoRepo {

   private static ArrayList<Avaliacao> avaliacoes = new ArrayList<>();

    public Avaliacao avaliacaoSalvar(Avaliacao av) {

        av.setId( avaliacoes.size() + 1 );

        avaliacoes.add( av );

        return av;
    }

    public Avaliacao buscar (int id){
        for (Avaliacao av : avaliacoes) {
            if (av.getId() == id) {
                return av;
            }
        }
        System.out.println("Nulo");
        return null;
    }

    public void listar(){
        for (Avaliacao av : avaliacoes) {
            System.out.printf("\n%d - %.2f\n",av.getId(), av.media());
        }
    }
}
