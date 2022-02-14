package e1;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

    public class Or implements ORyAND{
        @Override
        public List<Billetes> ORYAND(List<Billetes> tickets, Comparaciones... propiedades) {
            List<Billetes> Filtrados = new ArrayList<>();
            for(int i = 0; i< propiedades.length; i++){
                Filtrados.addAll(propiedades[i].filtrado(tickets, propiedades[i]));
            }
            return  Filtrados.stream().distinct().collect(Collectors.toList());
        }
    }


