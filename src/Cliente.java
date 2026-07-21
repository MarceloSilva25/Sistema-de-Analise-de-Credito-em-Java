import java.math.BigDecimal;
import java.time.LocalDate;

public class Cliente {

    String nome;
    int id;
    String profissao;
    String cpf;
    LocalDate dataDeNascimento;
    BigDecimal rendaMensal;
    int mesesEmpregos;

    public Cliente (String nome, int id, String profissao, String cpf, LocalDate dataDeNascimento, BigDecimal rendaMensal, int mesesEmpregos){
        this.nome=nome;
        this.id = id;
        this.profissao = profissao;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
        this.rendaMensal = rendaMensal;
        this.mesesEmpregos = mesesEmpregos;

    }
}

