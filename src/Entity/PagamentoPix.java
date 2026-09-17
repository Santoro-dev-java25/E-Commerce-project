package Entity;

import Enums.StatusPagamento;

public class PagamentoPix extends Pagamento{

    private String chavePix;

    public PagamentoPix(double valorPagamento, StatusPagamento statusPagamento, String chavePix){
        super(valorPagamento,statusPagamento);
        this.chavePix = chavePix;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public boolean processar() {
       if(chavePix.length() == 11){
           return true;
       }
       return false;
    }
}
