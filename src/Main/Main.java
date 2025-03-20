package Main;

import Classes.AreaVerde;
import Classes.Localizacao;
import Repositorios.AreaVerdeRepo;
import Repositorios.AvaliacaoRepo;
import Repositorios.LocalizacaoRepositor;


import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        LocalizacaoRepositor repo = new LocalizacaoRepositor();
        AvaliacaoRepo avRepo = new AvaliacaoRepo();
        AreaVerdeRepo avRepo2 = new AreaVerdeRepo();
        AreaVerde novaArea = null;

        int i = 0;

        while (i == 0) {

            System.out.println("\n\nDigite uma dás opções: \n" +
                    "1- Lista Área Verde\n" +
                    "2- Avaliar Área Verde\n" +
                    "3- Ver detalhe de uma Área verde\n" +
                    "4- Cadastrar nova Área Verde\n" +
                    "5- Sair");

            int escolha = sc.nextInt();

            switch (escolha) {

                case 1:

                   listarAreaVerdes(avRepo2);
                    break;

                case 2:

                    avaliar(novaArea,sc,avRepo2,avRepo);

                    
                    break;

                case 3:

                detalhes(novaArea,sc,avRepo2);

                break;

                case 4:

                    cadastrar(sc,avRepo2,repo);

                    break;

                case 5:

                    i++;

                    System.out.println("Tenha uma ótima semana!");

                    break;

                default:

                    System.out.print("Digite umas das opções disponiveis!");
                    break;
            }


        }
    }

    //Verificar se a Area Verde existe
    public static AreaVerde procourar (AreaVerdeRepo avRepo2,Scanner sc) {
        avRepo2.listarAreaVerdes();

        int area = sc.nextInt();

        AreaVerde novaArea = avRepo2.buscar(area);

        if (novaArea == null) {

            System.out.println("\nArea não encontrada! Favor indique um parque existente.\n");

            return null;
        } else {
            return novaArea;
        }
    }

    public static void listarAreaVerdes(AreaVerdeRepo avRepo2) {

        if (avRepo2.tamanho() == 0 && avRepo2.buscar(1) == null) {

            System.out.println("Lista Vazia!");
        } else {
            avRepo2.listarAreaVerdes();
        }

    }

    public static boolean avaliar(AreaVerde novaArea, Scanner sc, AreaVerdeRepo avRepo2, AvaliacaoRepo avRepo) {
        System.out.println("Qual area deseja avaliar?");

        novaArea = procourar(avRepo2, sc);

        if (novaArea == null) {

            return false;
        }
        System.out.println("\nMe informe notas de 0 a 10 referente a: \n");


        int n1 = getNota(sc,"Qualidade do ar:");
        int n2 = getNota(sc,"Quantidade de arvores: ");
        int n3 = getNota(sc,"Ausência de poluição sonora: ");
        int n4 = getNota(sc,"Coleta de residuos: ");
        int n5 = getNota(sc,"Facilidade de chegada: ");

        avRepo.avaliacaoSalvar(novaArea.avalia(n1, n2, n3, n4, n5));

        return true;
    }

    public static boolean detalhes(AreaVerde novaArea, Scanner sc, AreaVerdeRepo avRepo2) {
        System.out.println("Qual area deseja ver detalhes?");

        novaArea = procourar(avRepo2, sc);

        if (novaArea == null) {
            return false;
        }

        novaArea.toString();

        return true;

    }

    public static void cadastrar(Scanner sc, AreaVerdeRepo avRepo2, LocalizacaoRepositor repo) {

        System.out.print("Me diga o nome do local: ");
        sc.nextLine();
        String nome = sc.nextLine();

        System.out.print("\nInforme o em que o parque abre: ");
        String horaro = sc.nextLine();

        System.out.print("\nInforme o tipo de vegetação: ");
        String vegetacaoTipo = sc.nextLine();

        System.out.print("\nInforme a localização: ");
        String localizacao = sc.nextLine();

        AreaVerde novaVerde = new AreaVerde(nome, horaro, vegetacaoTipo, localizacao, repo, avRepo2, sc);

        System.out.print("Area salva com sucesso!");

    }

    public static int getNota(Scanner sc, String campo) {
        int nota;
        while (true) {
            System.out.print(campo);
            nota = sc.nextInt();

            // Verificando se a nota está dentro do intervalo válido
            if (nota >= 0 && nota <= 10) {
                break; // Se a nota estiver no intervalo, sai do loop
            } else {
                System.out.println("Nota inválida! Por favor, insira um número entre 0 e 10.");
            }
        }
        return nota;
    }


}
