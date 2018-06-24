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
    
    public static int[] adicionarNavio2X1(Quadrado[][] tabela){
        int[] navio2X1 = new int[4];
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
        navio2X1[0] = i1;
        navio2X1[1] = j1;
        navio2X1[2] = i2;
        navio2X1[3] = j2;
        
        return navio2X1;
    }
    
    public static int[] adicionarNavio3X1(Quadrado[][] tabela){
        int navio = 0;
        int i1 = 0;
        int j1 = 0;
        int i2 = 0;
        int j2 = 0;
        int j3 = 0;
        int i3 = 0;
       
        int[] navio3x1 = new int[6];
        while(navio != 3){
            
            navio = 0;
            
            i1 = (int) (Math.random() * 7);
            j1 = (int) (Math.random() * 7);

            i2 = (int) (Math.random() * 7);
            j2 = (int) (Math.random() * 7);

            if(i2 == i1){
                if(j2 == j1 - 1 || j2 == j1 + 1 ){
                    if(j1 == 0){
                        i3 = i2;
                        j3 = j2 + 1;
                        navio ++;
                    }else if(j2 == 0){
                        i3 = i2;
                        j3 = j1 + 1;
                        navio ++;
                    } else{
                         if(j2 > j1  && j2 < 6){
                            i3 = i2;
                            j3 = j2 + 1;
                            navio ++;
                        }else if(j2 < j1 ){
                            i3 = i2;
                            j3 = j2 - 1;
                            navio ++;
                        }
                    }
                }
                    
           }else if(j2 == j1){
                if(i2 == i1 - 1 || i2 == i1 + 1){
                    if(i2 == 0){
                        j3 = j2;
                        i3 = i1 + 1;
                        navio ++;
                    }else if(i1 == 0){
                        j3 = j2;
                        i3 = i2 + 1;
                       navio ++;
                    } else{
                        if(i2 > i1 && i2 < 6){
                            j3 = j2;
                            i3 = i2 + 1;
                            navio ++;
                        }else if(i2 < i1){
                            j3 = j2;
                            i3 = i2 - 1;
                            navio ++;
                        }
                    }
                }
            }else if(i2 == i1-1 && j2 == j1-1){
                if(i2 == 0 || j2 == 0){
                    i3 = i1 + 1;
                    j3 = j1 + 1;
                    navio++;
                }else{
                    i3 = i2 - 1;
                    j3 = j2 - 1;
                    navio ++;
                }
            }else if(i2 == i1 - 1 && j2 == j1 + 1){
                if(i2 == 6 || j2 == 0){
                    i3 = i1 + 1;
                    j3 = j1 - 1;
                    navio ++;
                }else{
                    i3 = i2 - 1;
                    j3 = j2 + 1;
                    navio ++;
                }
            }else if(i2 == i1 + 1 && j2 == j1 - 1){
                if(i2 == 6 || j2 == 0){
                    i3 = i1 - 1;
                    j3 = j1 + 1;
                    navio ++;
                }else{
                    i3 = i2 + 1;
                    j3 = j2 - 1;
                    navio ++;
                }
            }else if(i2 == i1 + 1 && j2 == j1 + 1){
                if(j2 == 6 || i2 == 6){
                    i3 = i1 - 1;
                    j3 = j1 - 1;
                    navio ++;
                }else{
                    i3 = i2 + 1;
                    j3 = j2 + 1;
                    navio ++;
                }
                
            }
           
                    
             if(i3 > 6 || i3 < 0 ||j3 > 6 || j3 < 0){
                 navio = 0;
             }else{
                 navio ++;
             }
            if(navio == 2){
                if(tabela[i1][j1].getEmbaixo() != 'X' && tabela[i2][j2].getEmbaixo() != 'X' && tabela[i3][j3].getEmbaixo() != 'X' ){
                    navio ++;
                }else{
                    navio = 0;
                }
            }
        }

        tabela[i1][j1].setEmbaixo('X'); 
        tabela[i2][j2].setEmbaixo('X');  
        tabela[i3][j3].setEmbaixo('X');
        
        navio3x1[0] = i1;
        navio3x1[1] = j1;
        navio3x1[2] = i2;
        navio3x1[3] = j2;
        navio3x1[4] = i3;
        navio3x1[5] = j3;
        
        return navio3x1;
    }
}
