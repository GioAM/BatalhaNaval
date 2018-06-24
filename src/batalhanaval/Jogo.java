/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalhanaval;

import java.io.PrintStream;
import java.util.Scanner;

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
    }
   
    public void jogar(){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nome do Jogador 1:");
        jogador1.setNome(scanner.next());
        System.out.println("Nome do Jogador 2:");
        jogador2.setNome(scanner.next());
        
        while(!jogador2.isAcertou() || !jogador1.isAcertou()){
            
            int i;
            int j;
            
            System.out.println("Tabuleiro de " + jogador1.getNome());
            tabuleiro1.mostrarTabuleiro();
            
            i = (int) (Math.random() * 8);
            j = (int) (Math.random() * 8);
            System.out.println(jogador1.jogada(tabuleiro1.getQuadrado(i - 1, j - 1)));
            
            jogador1.acertouNavio(tabuleiro1.getTabuleiro(), tabuleiro1.getNavio2x1());
            jogador1.acertouNavio(tabuleiro1.getTabuleiro(), tabuleiro1.getNavio3x1());
            
            if(jogador1.isAcertou()){
                break;
            }
            
            System.out.println("Tabuleiro de " + jogador2.getNome());
            tabuleiro2.mostrarTabuleiro();
            
            i = (int) (Math.random() * 8);
            j = (int) (Math.random() * 8);
            System.out.println(jogador2.jogada(tabuleiro2.getQuadrado(i -1  , j - 1)));
            
            jogador2.acertouNavio(tabuleiro2.getTabuleiro(), tabuleiro2.getNavio2x1());
            jogador2.acertouNavio(tabuleiro2.getTabuleiro(), tabuleiro2.getNavio3x1());
            
             if(jogador2.isAcertou()){
                break;
            }
        }
         System.out.println("Tabuleiro de " + jogador1.getNome());
         tabuleiro1.revelarTabuleiro();
        
         System.out.println("Tabuleiro de " + jogador2.getNome());
         tabuleiro2.revelarTabuleiro();
         
         System.out.print("Ganhador: ");
         
         if(jogador1.isAcertou()){
             System.out.println(jogador1.getNome());
         }else {
             System.out.println(jogador2.getNome());
         }
        
    }
    
}
