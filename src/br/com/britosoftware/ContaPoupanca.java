package br.com.britosoftware;

public class ContaPoupanca  extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimiExtrato() {
        System.out.println("==== Extrato Conta Poupança =====");
        imprimirInfosComuns();
    }
}
