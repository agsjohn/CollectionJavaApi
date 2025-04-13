package map.AgendaContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> mapContatos;

    public AgendaContatos() {
        this.mapContatos = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        mapContatos.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!mapContatos.isEmpty()){
            mapContatos.remove(nome);
        } else{
            System.out.println("Agenda está vazia");
        }
    }

    public void exibirContatos(){
        System.out.println(mapContatos);
    }

    public Integer pesquisarPorNome(String nome){
        Integer telefone = null;
        if(!mapContatos.isEmpty()){
            mapContatos.get(nome);
        }
        return telefone;
    }
}
