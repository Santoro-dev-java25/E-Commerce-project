package Entity;

import Enums.StatusPagamento;

import java.time.LocalDate;

public class PagamentoBoleto extends Pagamento{

    private String codigoBarras;
    private LocalDate dataVencimento;


    public PagamentoBoleto(double valorPagamento, StatusPagamento status,String codigoBarras,LocalDate data){
        super(valorPagamento,status);
        this.codigoBarras = codigoBarras;
        this.dataVencimento = data;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    @Override
    public boolean processar() {
        if(codigoBarras.length() == 44 && !dataVencimento.isBefore(LocalDate.now()) ){
            return true;
        }
        return false;
    }
}
