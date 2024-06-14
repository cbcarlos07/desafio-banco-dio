package br.com.britosoftware;

import lombok.Data;

import java.util.List;

@Data
public class Banco {
    private String nome;
    private List<Conta> contas;

    public void mostrarContas(){
        for (Conta conta: contas){
            System.out.println(conta);
        }
    }
}
