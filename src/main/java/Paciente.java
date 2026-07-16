// Apache NetBeans 24
// Autor: Micael Marinho Souza

public class Paciente extends Pessoa {

    // ATRIBUTOS ESPECÍFICOS DE PACIENTE
    private String historicoClinico;
    private String nivelUrgencia;

    // MÉTODO CONSTRUTOR
    public Paciente() {
        super();
        this.historicoClinico = "";
        this.nivelUrgencia = "";
    }

    // SOBRECARGA
    public Paciente(String historicoClinico, String nivelUrgencia) {
        super();
        this.historicoClinico = historicoClinico;
        this.nivelUrgencia = nivelUrgencia;
    }

    // GETTERS
    public String getHistoricoClinico() {
        return historicoClinico;
    }

    public String getNivelUrgencia() {
        return nivelUrgencia;
    }
    
    // SETTERS
    public void setHistoricoClinico(String historicoClinico) {
        this.historicoClinico = historicoClinico;
    }

    public void setNivelUrgencia(String nivelUrgencia) {
        this.nivelUrgencia = nivelUrgencia;
    }

    // SOBRESCRITA DO MÉTODO IDENTIFICAR TIPO
    public String identificarTipo() {
        return "Paciente";
    }
}
