package chain;

public class TipoDocumentoContratoInternacional implements TipoDocumento {

    private static final TipoDocumentoContratoInternacional INSTANCE = new TipoDocumentoContratoInternacional();

    private TipoDocumentoContratoInternacional() {}

    public static TipoDocumentoContratoInternacional getInstance() {
        return INSTANCE;
    }
}