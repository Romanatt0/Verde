package Classes;

import java.util.ArrayList;
import java.util.Scanner;

public class AreaVerde {

    private int id;
    private String nome;
    private String horario;
    private String vegetacaoTipo;
    private Avaliacao avaliacao;
    private Localizacao localizacao;

   private static ArrayList<String> atividades = new ArrayList<String>();


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

        for (int i = 0; i < quantidade; i++) {

            System.out.printf("Digite a tividade %d: ", i + 1);
            atividades.add(resposta.next());
        }

        System.out.println("Atividades registradas com sucesso!");
    }

    public void listarAtividades() {

        for (int i = 0; i < atividades.size(); i++) {
            System.out.printf("%d - %s\n", i + 1, atividades.get(i));
        }
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }

    public Avaliacao avalia(int n1, int n2, int n3, int n4, int n5) {

        this.avaliacao = new Avaliacao(n1, n2, n3, n4, n5);

        return avaliacao;
    }
}
