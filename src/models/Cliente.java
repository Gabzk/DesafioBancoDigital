package models;

public class Cliente {

    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        setCpf(cpf);
        setNome(nome);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
