package set.ConjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> listaConvidados;

    public ConjuntoConvidados() {
        this.listaConvidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        listaConvidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        for(Convidado c : listaConvidados){
            if(c.getCodigoConvite() == codigoConvite){
                listaConvidados.remove(c);
                break;
            }
        }
    }

    public int contarConvidados(){
        return listaConvidados.size();
    }

    public void exibirConvidados(){
        System.out.println(listaConvidados);
    }
}
