/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalhanaval;

/**
 *
 * @author giovani.meneguel
 */
public class Jogo {
    Tabuleiro tabuleiro1;
    Tabuleiro tabuleiro2;
    Jogador jogador1;
    Jogador jogador2;
    
    public Jogo(){
        tabuleiro1 = new Tabuleiro();
        tabuleiro2 = new Tabuleiro();
        
        jogador1 = new Jogador();
        jogador2 = new Jogador();
        
        tabuleiro2 = tabuleiro1;
    }
    
    public void jogar(){
        System.out.println("Tabuleiro 1");
        tabuleiro1.mostrarTabuleiro();
         System.out.println("Tabuleiro 2");
        tabuleiro2.mostrarTabuleiro();
         System.out.println("Tabuleiro 1");
        tabuleiro1.revelarTabuleiro();
         System.out.println("Tabuleiro 2");
        tabuleiro2.revelarTabuleiro();
    }
    
}
