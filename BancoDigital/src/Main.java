import Banco.Cliente.Cliente;
import Banco.Conta.Conta;
import Banco.Conta.ContaCorrente;
import Banco.Conta.ContaPoupanca;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente carlos = new Cliente();
        Cliente igor = new Cliente();
        carlos.setNome("Carlos Eduardo");
        igor.setNome("Igor do Carmo");
        Conta cc = new ContaCorrente(igor);
        Conta cp = new ContaPoupanca(carlos);
        cc.depositar(100_000);
        cc.sacar(1000);
        cc.transferir(1_500, cp);
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}