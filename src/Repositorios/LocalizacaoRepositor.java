package Repositorios;

import Classes.Localizacao;

import java.util.ArrayList;



public class LocalizacaoRepositor {

    static private ArrayList<Localizacao> localizacoes = new ArrayList<Localizacao>();

    public Localizacao salvar (Localizacao loc) {
        loc.setId(localizacoes.size() + 1);

        localizacoes.add(loc);

        return loc;
    }


}
