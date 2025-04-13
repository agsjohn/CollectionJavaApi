package set.AgendaContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos{
    private Set<Contato> setContatos;

    public AgendaContatos() {
        this.setContatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        setContatos.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(setContatos);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPesquisados = new HashSet<>();
        for(Contato c : setContatos){
            if(c.getNome().startsWith(nome)){
                contatosPesquisados.add(c);
            }
        }
        return contatosPesquisados;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : setContatos){
            if(c.getNome().equalsIgnoreCase(nome)){
                contatoAtualizado = c;
                contatoAtualizado.setNumero(novoNumero);
                break;
            }
        }
        return contatoAtualizado;
    }
}
