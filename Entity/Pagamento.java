package Entity;

import Enums.StatusPagamento;

public abstract class Pagamento {

    private double valorPagamento;//quanto loja esta guardando;
    private StatusPagamento status;

    public Pagamento(double valor,StatusPagamento status){
        this.valorPagamento = valor;
        this.status = status;
    }

    public double getValorPagamento() {
        return valorPagamento;
    }

    public void setValor(double valor) {
        this.valorPagamento = valor;
    }

    public StatusPagamento getStatus() {
        return status;
    }

    public void setStatus(StatusPagamento status) {
        this.status = status;
    }
    public abstract boolean processar();

    public boolean estornar(double valor){
        if(valor <= valorPagamento){
            status = StatusPagamento.CANCELADO;
            valorPagamento -= valor;
            return true;
        }
        return false;
    }
}
