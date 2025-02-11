package chain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class COFTests {

    private Funcionario funcionarioComum;
    private Funcionario gerente;
    private Funcionario diretor;
    private Funcionario ceo;

    @BeforeEach
    void setUp() {
        ceo = new CEO(null); 
        diretor = new Diretor(ceo);
        gerente = new Gerente(diretor);
        funcionarioComum = new FuncionarioComum(gerente);
    }

    @Test
    void testAssinarBoleto() {
        Documento documento = new Documento(TipoDocumentoBoleto.getInstance());
        String resultado = funcionarioComum.assinarDocumento(documento);
        assertEquals("Funcionário Comum assinou o documento.", resultado);
    }

    @Test
    void testAssinarContratoBaixoValor() {
        Documento documento = new Documento(TipoDocumentoContratoBaixoValor.getInstance());
        String resultado = funcionarioComum.assinarDocumento(documento);
        assertEquals("Gerente assinou o documento.", resultado);
    }

    @Test
    void testAssinarContratoAltoValor() {
        Documento documento = new Documento(TipoDocumentoContratoAltoValor.getInstance());
        String resultado = funcionarioComum.assinarDocumento(documento);
        assertEquals("Diretor assinou o documento.", resultado);
    }

    @Test
    void testAssinarRelatorioFinanceiro() {
        Documento documento = new Documento(TipoDocumentoRelatorioFinanceiro.getInstance());
        String resultado = funcionarioComum.assinarDocumento(documento);
        assertEquals("Diretor assinou o documento.", resultado);
    }

    @Test
    void testAssinarContratoInternacional() {
        Documento documento = new Documento(TipoDocumentoContratoInternacional.getInstance());
        String resultado = funcionarioComum.assinarDocumento(documento);
        assertEquals("CEO assinou o documento.", resultado);
    }

    @Test
    void testDocumentoSemAssinatura() {
        Documento documento = new Documento(null); // Tipo de documento desconhecido
        String resultado = funcionarioComum.assinarDocumento(documento);
        assertEquals("Sem assinatura", resultado);
    }
}