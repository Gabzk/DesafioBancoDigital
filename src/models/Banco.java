package models;

import java.util.ArrayList;

public class Banco {

    private String nome;
    private final ArrayList<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta... contas) {
        if (contas == null || contas.length == 0) {
            System.out.println("Nenhuma conta fornecida para adicionar.");
            return;
        }

        for (Conta conta : contas) {
            if (conta != null) { // Evita adicionar contas nulas
                this.contas.add(conta);
            } else {
                System.out.println("Conta nula ignorada.");
            }
        }
    }

    public Conta buscarConta(String numero) {
        for (Conta conta : contas) {
            if (conta.getNumero().equals(numero)) {
                return conta;
            }
        }
        return null; // Retorna null se não encontrar
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
