package Classes;

import Repositorios.AreaVerdeRepo;
import Repositorios.LocalizacaoRepositor;

import java.util.ArrayList;
import java.util.Scanner;

public class AreaVerde {

    private int id;
    private String nome;
    private String horario;
    private String vegetacaoTipo;
    private Avaliacao avaliacao;
    private Localizacao localizacao;

   private ArrayList<String> atividades = new ArrayList<String>();

    public AreaVerde( String nome, String horario, String vegetacaoTipo, String localizacao, LocalizacaoRepositor repositorio, AreaVerdeRepo av,Scanner scanner ) {
        this.nome = nome;
        this.horario = horario;
        this.vegetacaoTipo = vegetacaoTipo;
        this.localizacao = new Localizacao(localizacao, repositorio);
        av.salva( this );
        atividadesQuantidades(scanner);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getVegetacaoTipo() {
        return vegetacaoTipo;
    }

    public void setVegetacaoTipo(String vegetacaoTipo) {
        this.vegetacaoTipo = vegetacaoTipo;
    }

    public void atividadesQuantidades(Scanner resposta) {

        System.out.println("Quantas atividades são disponiveís no parque?");
        int quantidade = resposta.nextInt();
        resposta.nextLine();

        for (int i = 0; i < quantidade; i++) {

            System.out.printf("Digite a tividade %d: ", i + 1);
            atividades.add(resposta.nextLine());

        }

        System.out.println("Atividades registradas com sucesso!");
    }

    public void listarAtividades() {

        System.out.println("\nLista de atividades");

        for (int i = 0; i < this.atividades.size(); i++) {
            System.out.printf("\n%d - %s", i + 1, this.atividades.get(i));
        }
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Avaliacao avalia() {
        return avaliacao;
    }

    public Avaliacao avalia(int n1, int n2, int n3, int n4, int n5) {

        this.avaliacao = new Avaliacao(n1, n2, n3, n4, n5);

        return avaliacao;
    }

    @Override
    public String toString(){
        System.out.print("\n===============================");
        System.out.printf("\nLocal: %s\n\nHorário de funcionamento: %s\n\nTipo de vegetação: %s\n\nLocalização: %s",nome,horario,vegetacaoTipo,localizacao.getLocalizacao());
        System.out.print("\n===============================");
        listarAtividades();
        System.out.print("\n===============================");
        if(this.avaliacao != null){
            System.out.print(this.avaliacao.toString());
            System.out.print("\n==============================");
        }

        return null;
    }



}
