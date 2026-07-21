import java.math.BigDecimal;
import java.time.LocalDate;

public class SolicitacaoCredito{

    Cliente cliente;
    BigDecimal quantoPediu;
    int quantParcelas;
    LocalDate dataSolicitacao;
    int score;

    public Cliente getCliente() {
        return cliente;
    }
}

