// Apache NetBeans 24
// Autor: Micael Marinho Souza

public class Consulta implements Agendavel {
    // ATRIBUTOS
    private int codigo; 
    private String data;
    private String horario;
    private String status;
    private Paciente paciente;
    private Psicologo psicologo;

    // MÉTODO CONSTRUTOR
    public Consulta() {
        this.codigo = 0;
        this.data = "";
        this.horario = "";
        this.status = "Pendente";
        this.paciente = new Paciente();
        this.psicologo = new Psicologo();
    }

    // SOBRECARGA
    public Consulta(int codigo, String data, String horario, Paciente paciente, Psicologo psicologo) {
        this.codigo = codigo;
        this.data = data;
        this.horario = horario;
        this.status = "Pendente";
        this.paciente = paciente;
        this.psicologo = psicologo;
    }

    // GETTERS
    public int getCodigo() {
        return codigo;
    }

    public String getData() {
        return data;
    }

    public String getHorario() {
        return horario;
    }

    public String getStatus() {
        return status;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Psicologo getPsicologo() {
        return psicologo;
    }

    // SETTERS
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setPsicologo(Psicologo psicologo) {
        this.psicologo = psicologo;
    }

    // SOBRESCRITA DO MÉTODO IDENTIFICAR CONSULTA
    public String identificarConsulta() {
        return "Consulta";
    }

    // SOBRESCRITA
    public void agendar() throws ConsultaInvalidaException {
        if (this.data.length() == 0 || this.horario.length() == 0) {
            throw new ConsultaInvalidaException("Data e horário devem ser informados antes do agendamento");
        }
        this.status = "Agendada";
    }

    // SOBRESCRITA
    public void cancelar() throws ConsultaInvalidaException {
        if (this.codigo <= 0) {
            throw new ConsultaInvalidaException("Consulta sem código válido para cancelamento");
        }
        this.status = "Cancelada";
    }

    // SOBRESCRITA
    public String getSituacaoAgendamento() {
        return this.status;
    }
}
