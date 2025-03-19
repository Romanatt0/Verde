package Main;

import Classes.AreaVerde;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        AreaVerde areaVerde = new AreaVerde();

        Scanner sc = new Scanner(System.in);

        areaVerde.atividadesQuantidades(sc);

        areaVerde.listarAtividades();
    }
}
