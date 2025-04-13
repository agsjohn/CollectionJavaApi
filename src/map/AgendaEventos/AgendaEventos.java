package map.AgendaEventos;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos{
    private Map<LocalDate, Evento> mapEventos;

    public AgendaEventos(Map<LocalDate, Evento> mapEventos) {
        this.mapEventos = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        mapEventos.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosOrdem = new TreeMap<>(mapEventos);
    }

    public Map<LocalDate, Evento> getMapEventos() {
        return mapEventos;
    }

    public void obterProximoEvento(){
        Evento evento = null;
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosOrdem = new TreeMap<>(mapEventos);
        Set<LocalDate> dateSet = eventosOrdem.keySet();
        for(Map.Entry<LocalDate, Evento> entry : eventosOrdem.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("O próximo evento: " + entry.getValue() + " acontecerá na data " + entry.getKey());
                break;
            }
        }
    }
}
