package models;

import interfaces.IConta;

public abstract class Conta implements IConta {
    private static int SEQUENCIAL = 1;

    protected Cliente cliente;
    protected String agencia;
    protected String numero;
    protected double saldo;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.agencia = "0001";
        this.numero = String.format("%04d", SEQUENCIAL++);
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {
        System.out.printf("Titular: %s%n", this.cliente.getNome());
        System.out.printf("Agencia: %s%n", this.agencia);
        System.out.printf("Numero: %s%n", this.numero);
        System.out.printf("Saldo: %.2f%n", this.saldo);
    }
}
