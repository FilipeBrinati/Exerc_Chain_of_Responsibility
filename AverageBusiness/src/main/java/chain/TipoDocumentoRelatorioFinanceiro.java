package chain;

public class TipoDocumentoRelatorioFinanceiro implements TipoDocumento {

    private static final TipoDocumentoRelatorioFinanceiro INSTANCE = new TipoDocumentoRelatorioFinanceiro();

    private TipoDocumentoRelatorioFinanceiro() {}

    public static TipoDocumentoRelatorioFinanceiro getInstance() {
        return INSTANCE;
    }
}