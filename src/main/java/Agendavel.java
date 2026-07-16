// Apache NetBeans 24
// Autor: Micael Marinho Souza

public interface Agendavel {
    // MÉTODOS 
    public void agendar() throws ConsultaInvalidaException; 
    public void cancelar() throws ConsultaInvalidaException;
    public String getSituacaoAgendamento();
}
