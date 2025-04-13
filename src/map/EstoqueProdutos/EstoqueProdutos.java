package map.EstoqueProdutos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> mapEstoque;

    public EstoqueProdutos(Map<Long, Produto> mapEstoque) {
        this.mapEstoque = new HashMap<>();
    }

    public void adicionarProduto(Long cod, String nome, int quantidade, double preco){
        mapEstoque.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos(){
        System.out.println(mapEstoque);
    }

    public double calcularValorTotalEstoque() {
        double total = 0d;
        if(!mapEstoque.isEmpty()){
            for(Produto p : mapEstoque.values()){
                total += p.getPreco();
            }
        }
        return total;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!mapEstoque.isEmpty()){
            for(Produto p : mapEstoque.values()){
                if(maiorPreco < p.getPreco()){
                    maiorPreco = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }
}
