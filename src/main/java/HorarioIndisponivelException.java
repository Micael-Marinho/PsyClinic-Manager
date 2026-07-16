// Apache NetBeans 24
// Autor: Micael Marinho Souza

// EXCEÇÃO PERSONALIZADA PARA HORÁRIOS INDISPONÍVEIS
public class HorarioIndisponivelException extends Exception {
    public HorarioIndisponivelException() {
        super("Horário indisponível");
    }

    // SOBRECARGA
    public HorarioIndisponivelException(String mensagem) {
        super(mensagem);
    }
}
