package Entity;

public class Produto {
    private String id;
    private String nome;
    private Double preco;
    private Integer estoque;

    public Produto(){
    }
    public Produto(String id, String nome, Double preco, Integer estoque) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }
    public boolean verificarDisponibilidade(){
        if(estoque>0){
            return true;
        }
        else{
            return false;
        }
    }
    public void atualizarEstoque(int estoque){
        this.estoque = estoque;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}


