package Classes;

public class Avaliacao {

    private int id;
    private int qualidadeAr;
    private int quantidadeArvores;
    private int Som; //ausência de poluição sonora
    private int coletaDeResiduos;
    private int facilidadeChegada;

    public Avaliacao(int qualidadeAr, int quantidadeArvores, int som, int coletaDeResiduos, int facilidadeChegada) {
        this.qualidadeAr = qualidadeAr;
        this.quantidadeArvores = quantidadeArvores;
        Som = som;
        this.coletaDeResiduos = coletaDeResiduos;
        this.facilidadeChegada = facilidadeChegada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQualidadeAr() {
        return qualidadeAr;
    }

    public void setQualidadeAr(int qualidadeAr) {
        this.qualidadeAr = qualidadeAr;
    }

    public int getQuantidadeArvores() {
        return quantidadeArvores;
    }

    public void setQuantidadeArvores(int quantidadeArvores) {
        this.quantidadeArvores = quantidadeArvores;
    }

    public int getSom() {
        return Som;
    }

    public void setSom(int som) {
        Som = som;
    }

    public int getColetaDeResiduos() {
        return coletaDeResiduos;
    }

    public void setColetaDeResiduos(int coletaDeResiduos) {
        this.coletaDeResiduos = coletaDeResiduos;
    }

    public int getFacilidadeChegada() {
        return facilidadeChegada;
    }

    public void setFacilidadeChegada(int facilidadeChegada) {
        this.facilidadeChegada = facilidadeChegada;
    }

    public double media(int qualidadeAr, int quantidadeArvores, int Som, int coletaDeResiduos, int facilidadeChegada) {

        int soma = qualidadeAr + quantidadeArvores + Som + coletaDeResiduos + facilidadeChegada;

        double media = soma / 5;

        return media;
    }

    @Override
    public String toString() {
        return String.format("Avaliações " +
                "\nQualidade do ar: %d " +
                "\nQuantidade de arvores: %d " +
                "\nAuência de Poluição Sonora: %d " +
                "\nColeta de Residuoes: %d" +
                "\nFacilidade de chegada: %d ",
                getQualidadeAr(), getQuantidadeArvores(), getSom(), getColetaDeResiduos(), getFacilidadeChegada());
    }
}
