package Classes;

import Repositorios.LocalizacaoRepositor;

public class Localizacao {

    private int id;
    private String localizacao;

    public Localizacao(String localizacao, LocalizacaoRepositor repositorio) {
        this.localizacao = localizacao;
        repositorio.salvar(this);
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getLocalizacao() {

        return localizacao;
    }

    public void setLocalizacao(String localizacao) {

        this.localizacao = localizacao;
    }

    @Override
    public String toString() {
        return String.format("Localização id=" + id + ", localização=" + localizacao + "]");
    }

}
