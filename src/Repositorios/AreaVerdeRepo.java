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
            System.out.printf("%d - %s\n", av.getId() + 1, av.getNome());
        }
    }

    public AreaVerde buscar (String Verde){
        for (AreaVerde av : areaVerdes) {
            if (Verde.equalsIgnoreCase(av.getNome())) {
                return av;
            }
        }
        return null;
    }

    public AreaVerde buscar (int id){
        for (AreaVerde av : areaVerdes) {
            if (av.getId() == id) {
                return av;
            }
        }
        return null;
    }



    public int tamanho (){

        return areaVerdes.size();
    }


}
