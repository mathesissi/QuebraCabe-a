/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quebracabeça;

/**
 *
 * @author mathe
 */
public class Tabuleiro {
    String[][] tabuleiro = new String[3][3];

    public String[][] getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(String[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
    }
    public void exibirT(String x){//exibir mini tabuleiro indicando a posição atual das peças.
        for(int i=0; i<tabuleiro.length;i++){
            System.out.print("\t0");
            for(int j=0; j <tabuleiro[i].length;j++);
            System.out.print("\t1");
        }
    }
    
}
