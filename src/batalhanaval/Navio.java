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
public class Navio {
    public void adicionarNavio2X1(Quadrado[][] tabela){
        int navio = 0;
        int i1 = 0;
        int j1 = 0;
        int i2 = 0;
        int j2 = 0;
       
        while(navio != 2){
            
            navio = 0;
            
            i1 = (int) (Math.random() * 7);
            j1 = (int) (Math.random() * 7);

            i2 = (int) (Math.random() * 7);
            j2 = (int) (Math.random() * 7);

            if(i2 == i1-1 && (j1==j2 || j1 == j2+1 || j1== j2-1)){
                navio ++;
            }else if(i2 == i1 && (j1 == j2+1 || j1== j2-1)){
                navio ++;
            }else if(i2 == i1+1 && (j1==j2 || j1 == j2+1 || j1== j2-1)){
                navio ++;
            }
            
            if(tabela[i1][j1].getEmbaixo() != 'X' && tabela[i2][j2].getEmbaixo() != 'X' ){
                navio ++;
            }else{
                navio = 0;
            }
        }
        tabela[i1][j1].setEmbaixo('X'); 
        tabela[i2][j2].setEmbaixo('X');  
    }
}
