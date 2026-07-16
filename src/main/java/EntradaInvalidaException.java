// Apache NetBeans 24
// Autor: Micael Marinho Souza

// EXCEÇÃO PERSONALIZADA PARA ENTRADAS INVÁLIDAS
public class EntradaInvalidaException extends Exception {
    public EntradaInvalidaException() {
        super("Entrada invalida");
    }

    // SOBRECARGA
    public EntradaInvalidaException(String mensagem) {
        super(mensagem);
    }
}
