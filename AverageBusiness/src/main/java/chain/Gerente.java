package chain;

public class Gerente extends Funcionario {

    public Gerente(Funcionario superior) {
        adicionarDocumentoPermitido(TipoDocumentoContratoBaixoValor.getInstance());
        setFuncionarioSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Gerente";
    }
}