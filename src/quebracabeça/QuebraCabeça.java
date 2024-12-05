/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quebracabeça;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class QuebraCabeça {

    /**
     * @param args the command line arguments
     */    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op=0, op1, op2, i, j;
        String posicao;
        Tabuleiro t1 = new Tabuleiro();
        Borda pp = new Borda("preechido totalmente");
        Borda pv = new Borda("preechido/vazio");
        Borda vp = new Borda("vazio/preechido");
        //cima,baixo,esquerda,direita;
        Peca p1 = new Peca("peca 1", pp,vp,pv,pp );//canto superior esquerdo
        Peca p2 = new Peca("peca 2", pp,pv,pp,vp);//canto superior direito
        Peca p3 = new Peca("peca 3", pv,pp,vp,pp);//canto inferior esquerdo
        Peca p4 = new Peca("peca 4", vp,pp,pp,vp);//canto inferior direito
        Peca p5 = new Peca("peca 5", pp,pv,pv,vp);//meio superior
        Peca p6 = new Peca("peca 6", pv,pp,pv,pv);//meio inferior
        Peca p7 = new Peca("peca 7", vp,pv,pp,vp);//lateral esquerdo
        Peca p8 = new Peca("peca 8", pv,vp,pv,pp);//lateral direito
        Peca p9 = new Peca("peca 9", vp,vp,pv,vp);//centro
       
        ArrayList<Peca> listaDePeças = new ArrayList<Peca>();
        listaDePeças.add(p1);
        listaDePeças.add(p2);
        listaDePeças.add(p3);
        listaDePeças.add(p4);
        listaDePeças.add(p5);
        listaDePeças.add(p6);
        listaDePeças.add(p7);
        listaDePeças.add(p8);
        listaDePeças.add(p9);
       
        System.out.println("Peças disponiveis:");
        Iterator p = listaDePeças.iterator();
        while(p.hasNext()){
            System.out.println(p.next());
        }
        System.out.println("Escolha uma peça: ");
        op1 = sc.nextInt();
        System.out.println("Escolha outra peça: ");
        op2 = sc.nextInt();
        System.out.println("Escolha em qual parte encaixar (cima,baixo,esquerda,direita): ");
        posicao = sc.next(posicao);
        
    } 
}
