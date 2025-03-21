package Repositorios;

import Classes.Avaliacao;
import Classes.Localizacao;

import java.util.ArrayList;

public class LocalizacaoRepositor {

    static private ArrayList<Localizacao> localizacoes = new ArrayList<Localizacao>();

    public Localizacao salvar (Localizacao loc) {
        loc.setId(localizacoes.size() + 1);

        localizacoes.add(loc);

        System.out.println("Localização Salva!");

        return loc;
    }

    public Localizacao buscar (int id){
        for (Localizacao av : localizacoes) {
            if (av.getId() == id) {
                return av;
            }
        }
        System.out.println("Nulo");
        return null;
    }

    public void listar(){
        for (Localizacao av : localizacoes) {
            System.out.printf("\n%d - %.2f\n",av.getId(), av.getLocalizacao());
        }
    }


}
