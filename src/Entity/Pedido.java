package src.Entity;

import src.Enums.StatusPedido;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Pedido {

    private LocalDate data;
    private Entity.Cliente cliente;
    private long id;
    private Entity.Pagamento pagamento;
    private List<ItemPedido> itens = new ArrayList<>();
    private StatusPedido status;

    public Pedido(Entity.Cliente cliente, long id, Entity.Pagamento pagamento){
        this.data = LocalDate.now();
        this.cliente = cliente;
        this.id = id;
        this.pagamento = pagamento;
        this.status = StatusPedido.AGUARDANDO_PAGAMENTO;
    }

    public double calcularTotal() {
        return itens.stream().mapToDouble(item -> item.getPrecoUnitario() * item.getQuantidade()).sum();

    }

    public void atualizarStatus(StatusPedido status){
        this.status = status;
    }
}
