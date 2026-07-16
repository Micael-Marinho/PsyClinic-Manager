// Apache NetBeans 24
// Autor: Micael Marinho Souza

public class Psicologo extends Pessoa {

    // ATRIBUTOS ESPECÍFICOS DE PSICOLOGO
    private String crp;
    private String abordagem;

    // MÉTODO CONSTRUTOR
    public Psicologo() {
        super();
        this.crp = "";
        this.abordagem = "";
    }

    // SOBRECARGA
    public Psicologo(String crp, String abordagem) {
        super();
        this.crp = crp;
        this.abordagem = abordagem;
    }

    // GETTERS
    public String getCrp() {
        return crp;
    }

    public String getAbordagem() {
        return abordagem;
    }

    // SETTERS
    public void setCrp(String crp) {
        this.crp = crp;
    }

    public void setAbordagem (String abordagem) {
        this.abordagem = abordagem;
    }

    // SOBRESCRITA
    public String identificarTipo() {
        return "Psicologo";
    }
}
