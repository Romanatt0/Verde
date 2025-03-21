package Repositorios;

import Classes.AreaVerde;
import Classes.Avaliacao;

import java.awt.geom.Area;
import java.util.ArrayList;

public class AreaVerdeRepo {

    private static ArrayList<AreaVerde> areaVerdes = new ArrayList<AreaVerde>();

    public static ArrayList<AreaVerde> getAreaVerdes() {
        return areaVerdes;
    }

    public static void setAreaVerdes(ArrayList<AreaVerde> areaVerdes) {
        AreaVerdeRepo.areaVerdes = areaVerdes;
    }

    public AreaVerde areaVerdeSalvar(AreaVerde av) {

        av.setId( areaVerdes.size() + 1 );

        areaVerdes.add( av );

        return av;
    }

    public void listarAreaVerdes() {
        for (AreaVerde av : areaVerdes) {
            System.out.println("\n---------------------------------------");
            System.out.printf("%d - %s\n\nTipo de vegetação: %s", av.getId(), av.getNome(), av.getVegetacaoTipo());

            if(av.avalia() != null) {
                System.out.printf("\nMédia: %.2f\n",av.getAvaliacao().media());
            }
        }
    }


    public AreaVerde buscar (int id){
        for (AreaVerde av : areaVerdes) {
            if (av.getId() == id) {
                return av;
            }
        }
        System.out.println("Nulo");
        return null;
    }

    public int tamanho (){

        return areaVerdes.size();
    }

    public AreaVerde salva (AreaVerde av){

        av.setId( areaVerdes.size() + 1 );

        areaVerdes.add( av );

        return av;
    }


}
