package br.ufjf.dcc193.exm00;

import org.springframework.stereotype.Component;

@Component
public class Hero {
    private String nome;
    public Hero() {
        this.nome = "Jackie Chan";
    }
    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
