package chain;

public class CEO extends Funcionario {

    public CEO(Funcionario superior) {
        adicionarDocumentoPermitido(TipoDocumentoContratoInternacional.getInstance());
        setFuncionarioSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "CEO";
    }
}