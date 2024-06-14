package br.com.britosoftware;

import lombok.Data;

@Data
public class Cliente {
    private String nome;

    @Override
    public String toString() {
        return  "Titular: "+nome;
    }
}
