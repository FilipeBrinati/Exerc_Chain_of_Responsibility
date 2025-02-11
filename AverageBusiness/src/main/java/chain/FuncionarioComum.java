package chain;

public class FuncionarioComum extends Funcionario {

    public FuncionarioComum(Funcionario superior) {
        adicionarDocumentoPermitido(TipoDocumentoBoleto.getInstance());
        setFuncionarioSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Funcionário Comum";
    }
}