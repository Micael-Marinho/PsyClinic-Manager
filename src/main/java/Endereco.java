// Apache NetBeans 24
// Autor: Micael Marinho Souza

public class Endereco {
    // ATRIBUTOS
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;

    // MÉTODO CONSTRUTOR
    public Endereco() {
        this.rua = "";
        this.numero = "";
        this.bairro = "";
        this.cidade = "";
    }

    // SOBRECARGA
    public Endereco(String rua, String numero, String bairro, String cidade) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    // GETTERS
    public String getRua() {
        return rua;
    }

    public String getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }
    
    // SETTERS
    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
