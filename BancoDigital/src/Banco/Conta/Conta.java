package Banco.Conta;

import Banco.Cliente.Cliente;

public abstract class Conta implements IConta {
    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    private double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        try{
            if (this.saldo < valor){
                throw new ArithmeticException("Saldo insuficiente!");
            }else{
                this.saldo -= valor;
            }
        }catch (ArithmeticException e){
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void depositar(double valor) {
        try {
            if (valor < 1){
                throw new ArithmeticException("Depósito invalido!");
            }else{
                this.saldo += valor;
            }
        } catch (ArithmeticException e){
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        try{
            if (this.saldo < valor || valor < 1){
                throw new ArithmeticException("Erro na tranferencia!");
            }else{
                this.sacar(valor);
                contaDestino.depositar(valor);
            }
        }catch (ArithmeticException e){
            System.err.println(e.getMessage());
        }

    }

    protected void imprimirDadosDoExtrato() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(("Agencia: "+"000"+this.agencia));
        System.out.println(String.format("Conta: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }


}
