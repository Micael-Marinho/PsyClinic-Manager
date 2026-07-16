// Apache NetBeans 24
// Autor: Micael Marinho Souza

public class AtestadoPsicologico extends Consulta {
    // ATRIBUTOS ESPECÍFICOS DE ATESTADO PSICOLÓGICO
    private int indicarDiasAfastamento;
    private String motivoAtestado;

    // MÉTODO CONSTRUTOR
    public AtestadoPsicologico() {
        super();
        this.indicarDiasAfastamento = 0;
        this.motivoAtestado = "";
    }

    // SOBRECARGA
    public AtestadoPsicologico(int indicarDiasAfastamento, String motivoAtestado) {
        super();
        this.indicarDiasAfastamento = indicarDiasAfastamento;
        this.motivoAtestado = motivoAtestado;
    }

    // GETTERS
    public int getIndicarDiasAfastamento() {
        return indicarDiasAfastamento;
    }

     public String getMotivoAtestado() {
        return motivoAtestado;
    }

    // SETTERS
    public void setIndicarDiasAfastamento(int indicarDiasAfastamento) {
        this.indicarDiasAfastamento = indicarDiasAfastamento;
    }

    public void setMotivoAtestado(String motivoAtestado) {
        this.motivoAtestado = motivoAtestado;
    }

    // SOBRESCRITA
    public String identificarConsulta() {
        return "Atestado Psicologico";
    }
}
