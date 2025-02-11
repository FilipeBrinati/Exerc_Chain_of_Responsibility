package chain;

public class TipoDocumentoContratoAltoValor implements TipoDocumento {

    private static final TipoDocumentoContratoAltoValor INSTANCE = new TipoDocumentoContratoAltoValor();

    private TipoDocumentoContratoAltoValor() {}

    public static TipoDocumentoContratoAltoValor getInstance() {
        return INSTANCE;
    }
}