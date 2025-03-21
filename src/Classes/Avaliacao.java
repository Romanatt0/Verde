package Classes;

public class Avaliacao {

    private int id;


    int[] avaliacoes = new int[5];

    public int[] getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(int[] avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public Avaliacao(int n1, int n2, int n3, int n4, int n5) {
        this.avaliacoes[0] = n1;
        this.avaliacoes[1] = n2;
        this.avaliacoes[2] = n3;
        this.avaliacoes[3] = n4;
        this.avaliacoes[4] = n5;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public double media() {

        int soma = getAvaliacoes()[0] + getAvaliacoes()[1] + getAvaliacoes()[2] + getAvaliacoes()[3] + getAvaliacoes()[4];

        double media = soma / 5;

        return media;
    }

    @Override
    public String toString() {
        return String.format("\nAvaliações \n" +
                "\nQualidade do ar: %d " +
                "\nQuantidade de arvores: %d " +
                "\nAuência de Poluição Sonora: %d " +
                "\nColeta de Residuoes: %d" +
                "\nFacilidade de chegada: %d " +
                "\nMédia: %.2f",
                getAvaliacoes()[0],getAvaliacoes()[1],getAvaliacoes()[2],getAvaliacoes()[3],getAvaliacoes()[4],media());
    }
}
