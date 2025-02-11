package chain;

public class TipoDocumentoContratoBaixoValor implements TipoDocumento {

    private static final TipoDocumentoContratoBaixoValor INSTANCE = new TipoDocumentoContratoBaixoValor();

    private TipoDocumentoContratoBaixoValor() {}

    public static TipoDocumentoContratoBaixoValor getInstance() {
        return INSTANCE;
    }
}