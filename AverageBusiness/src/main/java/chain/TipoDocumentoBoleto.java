package chain;

public class TipoDocumentoBoleto implements TipoDocumento {

    private static final TipoDocumentoBoleto INSTANCE = new TipoDocumentoBoleto();

    private TipoDocumentoBoleto() {}

    public static TipoDocumentoBoleto getInstance() {
        return INSTANCE;
    }
}