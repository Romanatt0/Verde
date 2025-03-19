package Main;

import Classes.AreaVerde;
import Classes.Localizacao;
import Repositorios.AreaVerdeRepo;
import Repositorios.AvaliacaoRepo;
import Repositorios.LocalizacaoRepositor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LocalizacaoRepositor repo = new LocalizacaoRepositor();
        AvaliacaoRepo avRepo = new AvaliacaoRepo();
        AreaVerdeRepo avRepo2 = new AreaVerdeRepo();

        int i = 0;

        while (i == 0) {

            System.out.println("Digite uma dás opções: \n" +
                    "1- Lista Área Verde\n" +
                    "2- Avaliar Área Verde\n" +
                    "3- Ver detalhe de uma Área verde\n" +
                    "4- Cadastrar nova Área Verde");
            int escolha = sc.nextInt();

            switch (escolha) {

                case 1:
                    if (avRepo2.tamanho() <= 0) {

                        System.out.println("Lista Vazia!");
                    } else {
                        avRepo2.listarAreaVerdes();
                    }

                    break;

                case 2:

                    System.out.println("Qual area deseja avaliar?");

                    avRepo2.listarAreaVerdes();

                    int area = sc.nextInt();

                   AreaVerde novaArea = avRepo2.buscar(area);

                   System.out.println("Me informe as notas de: \n");

                    System.out.print("\nQualidade do ar: ");
                    int n1 = sc.nextInt();
                    System.out.print("\nQuantidade de arvores: ");
                    int n2 = sc.nextInt();
                    System.out.print("\nAusência de poluição sonora: ");
                    int n3 = sc.nextInt();
                    System.out.print("\nColeta de residuos: ");
                    int n4 = sc.nextInt();
                    System.out.print("\nFacilidade de chegada: ");
                    int n5 = sc.nextInt();

                    avRepo.avaliacaoSalvar(novaArea.avalia(n1, n2, n3, n4, n5));

                    break;



            }

        }
    }
}