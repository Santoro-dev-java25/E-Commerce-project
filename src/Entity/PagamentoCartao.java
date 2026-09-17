package Entity;

import Enums.StatusPagamento;

public class PagamentoCartao extends Pagamento{


    private String numeroCartao;
    private int numeroParcelas;

    public PagamentoCartao(double valor, StatusPagamento status,String numeroCartao,int numeroParcelas){
        super(valor, status);
        this.numeroCartao = numeroCartao;
        this.numeroParcelas = numeroParcelas;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
    @Override
    public boolean processar() {
        if(numeroCartao.length() == 16 && numeroParcelas > 0 ){
            return true;
        }
        return false;

    }



}
