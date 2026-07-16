// Apache NetBeans 24
// Autor: Micael Marinho Souza

public class Terapia extends Consulta {
    // ATRIBUTOS ESPECÍFICOS DE TERAPIA
    private String abordagem;
    private int numeroSessao;

    // MÉTODO CONSTRUTOR
    public Terapia() {
        super();
        this.abordagem = "";
        this.numeroSessao = 0;
    }

    // SOBRECARGA
    public Terapia(String abordagem, int numeroSessao) {
        super();
        this.abordagem = abordagem;
        this.numeroSessao = numeroSessao;
    }

    // GETTERS
    public String getAbordagem() {
        return abordagem;
    }

    public int getNumeroSessao() {
        return numeroSessao;
    }

    // SETTERS
    public void setAbordagem(String abordagem) {
        this.abordagem = abordagem;
    } 

    public void setNumeroSessao(int numeroSessao) {
        this.numeroSessao = numeroSessao;
    }

    // SOBRESCRITA
    public String identificarConsulta() {
        return "Terapia";
    }
}
