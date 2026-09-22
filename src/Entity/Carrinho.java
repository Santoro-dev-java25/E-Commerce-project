package Entity;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<ItemCarrinho> listaItens = new ArrayList<>();

    public Carrinho(List<ItemCarrinho> listaItens) {
        this.listaItens = listaItens;
    }

    public List<ItemCarrinho> getListaItens() {
        return listaItens;
    }

    public void addItem(ItemCarrinho itemCarrinho){
        listaItens.add(itemCarrinho);
    }
    public void removeItem(ItemCarrinho itemCarrinho){
        listaItens.remove(itemCarrinho);
    }
    public Double calcularTotal(){
        double valorTotal = 0;
        for(ItemCarrinho item : listaItens){
            valorTotal+= item.subtotal();
        }
        return valorTotal;
    }
}
