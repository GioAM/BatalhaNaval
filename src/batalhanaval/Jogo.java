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
        
        tabuleiro2 = tabuleiro1;
    }
   
    public void jogar(){
        for(int i2 = 0; i2 < 10; i2++){
            int i;
            int j;

            Scanner scanner = new Scanner(System.in);
            i = scanner.nextInt();
            j = scanner.nextInt();
            System.out.println(jogador1.jogada(tabuleiro1.getQuadrado(i, j)));
            System.out.println("Tabuleiro 1");
            tabuleiro1.mostrarTabuleiro();
        }

       
    }
    
}
