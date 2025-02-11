package chain;

public class Diretor extends Funcionario {

    public Diretor(Funcionario superior) {
        adicionarDocumentoPermitido(TipoDocumentoContratoAltoValor.getInstance());
        adicionarDocumentoPermitido(TipoDocumentoRelatorioFinanceiro.getInstance());
        setFuncionarioSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Diretor";
    }
}