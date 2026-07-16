// Apache NetBeans 24
// Autor: Micael Marinho Souza

public class LaudoPsicologico extends Consulta {
    // ATRIBUTOS ESPECÍFICOS DE LAUDO PSICOLÓGICO
    private String finalidadeLaudo;
    private String conclusaoTecnica;

    // MÉTODO CONSTRUTOR
    public LaudoPsicologico() {
        super();
        this.finalidadeLaudo = "";
        this.conclusaoTecnica = "";
    }

    // SOBRECARGA
    public LaudoPsicologico(String finalidadeLaudo, String conclusaoTecnica) {
        super();
        this.finalidadeLaudo = finalidadeLaudo;
        this.conclusaoTecnica = conclusaoTecnica;
    }

    // GETTERS
    public String getFinalidadeLaudo() {
        return finalidadeLaudo;
    }

    public String getConclusaoTecnica() {
        return conclusaoTecnica;
    }

    // SETTERS
    public void setFinalidadeLaudo(String finalidadeLaudo) {
        this.finalidadeLaudo = finalidadeLaudo;
    }

    public void setConclusaoTecnica(String conclusaoTecnica) {
        this.conclusaoTecnica = conclusaoTecnica;
    }

    // SOBRESCRITA
    public String identificarConsulta() {
        return "Laudo Psicologico";
    }
}
