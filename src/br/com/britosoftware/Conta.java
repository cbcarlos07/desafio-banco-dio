package br.com.britosoftware;

public abstract class Conta implements IConta{
    private static final int AGENCIA_PADRAO = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    private static int SEQUENCIAL = 1;

    public Conta(Cliente _cliente) {
        agencia = AGENCIA_PADRAO;
        numero = SEQUENCIAL++;
        cliente = _cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contadestino) {
        sacar(valor);
        contadestino.depositar(valor);
    }


    protected void imprimirInfosComuns(){
        System.out.println(cliente);
        System.out.println(String.format("Agência: %d", agencia));
        System.out.println(String.format("Número: %d", numero));
        System.out.println(String.format("Saldo: %.2f", saldo));
    }

    @Override
    public String toString() {
        return "Conta{\n" +
                "Agência=" + agencia +
                "\n, Numero=" + numero +
                "\n, Saldo=" + String.format("Saldo: %.2f", saldo) +
                "\n, "+ cliente +
                "\n}";
    }
}
