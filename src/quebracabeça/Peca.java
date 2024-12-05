/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quebracabeça;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mathe
 */
public class Peca {
    private String nome;
    private Borda cima;
    private Borda baixo;
    private Borda esquerda;
    private Borda direita;

    public Peca(String nome, Borda cima, Borda baixo, Borda esquerda, Borda direita) {
        this.nome = nome;
        this.cima = cima;
        this.baixo = baixo;
        this.esquerda = esquerda;
        this.direita = direita;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Borda getCima() {
        return cima;
    }

    public Borda getBaixo() {
        return baixo;
    }

    public Borda getEsquerda() {
        return esquerda;
    }

    public Borda getDireita() {
        return direita;
    }
  
    @Override
    public String toString() {
        return nome + " Bcima=" + cima + ", Bbaixo=" + baixo + ", Besquerda=" + esquerda + ", Bdireita=" + direita + '}';
    }
    
    
}
