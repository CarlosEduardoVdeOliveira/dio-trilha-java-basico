package Banco.Conta;

import Banco.Cliente.Cliente;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("######--- Extrato Conta Poupança ---######");
        super.imprimirDadosDoExtrato();
    }
}
