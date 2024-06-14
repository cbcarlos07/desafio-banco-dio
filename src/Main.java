import br.com.britosoftware.*;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();
        Cliente carlos = new Cliente();
        carlos.setNome("Carlos");

        Conta cc = new ContaCorrente(carlos);
        cc.depositar(100);
        Conta poupanca = new ContaPoupanca(carlos);
        cc.transferir(50, poupanca);
        contas.add(cc);
        contas.add(poupanca);
        Banco banco = new Banco();
        banco.setContas(contas);
        cc.imprimiExtrato();
        poupanca.imprimiExtrato();
        banco.mostrarContas();

    }
}