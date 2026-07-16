// Apache NetBeans 24
// Autor: Micael Marinho Souza

public class Pessoa { 

    // ATRIBUTOS A SEREM HERDADOS POR PACIENTE, FAMILIAR E PSICOLOGO
    private String nome;
    private String cpf;
    private String telefone;
    private int idade;
    private Endereco endereco;

    // MÉTODO CONSTRUTOR
    public Pessoa() {
        this.nome = "";
        this.cpf = "";
        this.telefone = "";
        this.idade = 0;
        this.endereco = new Endereco();
    }

    // SOBRECARGA
    public Pessoa(String nome, String cpf, String telefone, int idade, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.idade = idade;
        this.endereco = endereco;
    }

    // GETTERS
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public int getIdade() {
        return idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    // SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    // MÉTODO PARA IDENTIFICAR O TIPO DE PESSOA (SERÁ SOBRESCRITO NAS CLASSES FILHAS)
    public String identificarTipo() { //
        return "Pessoa";
    }
}
