// Apache NetBeans 24
// Autor: Micael Marinho Souza

// EXCEÇÃO PERSONALIZADA PARA CONSULTAS INVÁLIDAS
public class ConsultaInvalidaException extends Exception {
    public ConsultaInvalidaException() {
        super("Consulta inválida");
    }

    // SOBRECARGA
    public ConsultaInvalidaException(String mensagem) {
        super(mensagem);
    }
}
