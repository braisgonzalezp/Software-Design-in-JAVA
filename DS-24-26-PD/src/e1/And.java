package e1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class And implements ORyAND{

    @Override
    public List<Billetes> ORYAND(List<Billetes> billetes, Comparaciones... propiedades) {
        List<Billetes> Filtrados = new ArrayList<>();
        List<Billetes> aux = new ArrayList<>();
        for(int i = 0; i < propiedades.length; i++){
            aux.addAll(propiedades[i].filtrado(billetes, propiedades[i])) ;
            for(int j = 0; j < aux.size(); j++){
                if(propiedades.length == Collections.frequency(aux, aux.get(j))){
                    Filtrados.add(aux.get(j));
                }
            }
        }

        return Filtrados.stream().distinct().collect(Collectors.toList());
    }
}
