// Apache NetBeans 24
// Autor: Micael Marinho Souza

public class OrientacaoVocacional extends Consulta {
    // ATRIBUTOS ESPECÍFICOS DE ORIENTAÇÃO VOCACIONAL
    private String areaInteresse;
    private String testeAplicado;

    // MÉTODO CONSTRUTOR
    public OrientacaoVocacional() {
        super();
        this.areaInteresse = "";
        this.testeAplicado = "";
    }

    // SOBRECARGA
    public OrientacaoVocacional(String areaInteresse, String testeAplicado) {
        super();
        this.areaInteresse = areaInteresse;
        this.testeAplicado = testeAplicado;
    }

    // GETTERS
    public String getAreaInteresse() {
        return areaInteresse;
    }

    public String getTesteAplicado() {
        return testeAplicado;
    }

    // SETTERS
    public void setAreaInteresse(String areaInteresse) {
        this.areaInteresse = areaInteresse;
    }

    public void setTesteAplicado(String testeAplicado) {
        this.testeAplicado = testeAplicado;
    }

    // SOBRESCRITA
    public String identificarConsulta() {
        return "Orientacao Vocacional";
    }
}
