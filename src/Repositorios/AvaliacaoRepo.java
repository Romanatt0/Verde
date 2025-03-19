package Repositorios;

import Classes.Avaliacao;

import java.util.ArrayList;

public class AvaliacaoRepo {

   private static ArrayList<Avaliacao> avaliacoes = new ArrayList<>();

    public Avaliacao avaliacaoSalvar(Avaliacao av) {

        av.setId( avaliacoes.size() + 1 );

        avaliacoes.add( av );

        return av;
    }
}
