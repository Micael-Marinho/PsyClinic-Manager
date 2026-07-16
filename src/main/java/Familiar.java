// Apache NetBeans 24
// Autor: Micael Marinho Souza

public class Familiar extends Pessoa {
    // ATRIBUTOS ESPECÍFICOS DE FAMILIAR
    private String parentesco;
    private String responsavelFinanceiro;

    // MÉTODO CONSTRUTOR
    public Familiar() {
        super();
        this.parentesco = "";
        this.responsavelFinanceiro = "";
    }

    // SOBRECARGA
    public Familiar(String parentesco, String responsavelFinanceiro) {
        super();
        this.parentesco = parentesco;
        this.responsavelFinanceiro = responsavelFinanceiro;
    }

    // GETTERS
    public String getParentesco() {
        return parentesco;
    }

    public String getResponsavelFinanceiro() {
        return responsavelFinanceiro;
    }

    //SETTERS
    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public void setResponsavelFinanceiro(String responsavelFinanceiro) {
        this.responsavelFinanceiro = responsavelFinanceiro;
    }

    // SOBRESCRITA
    public String identificarTipo() {
        return "Familiar";
    }
}
