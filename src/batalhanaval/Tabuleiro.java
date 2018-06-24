package batalhanaval;

import static batalhanaval.Navio.adicionarNavio2X1;
import static batalhanaval.Navio.adicionarNavio3X1;

/**
 *
 * @author giovani.meneguel && leticia.may
 */
public class Tabuleiro {
    
    private Quadrado[][] tabuleiro;
    private int[] navio3x1;
    private int[] navio2x1;
    
    public Tabuleiro(){
        tabuleiro = new Quadrado[7][7];
        
        for(int i = 0; i < 7; i++){
           for(int j = 0; j < 7; j++){
               
               tabuleiro[i][j] = new Quadrado();
           }
       }
       navio3x1 = adicionarNavio3X1(tabuleiro);
       navio2x1 = adicionarNavio2X1(tabuleiro);
       
    }
   
    public Quadrado getQuadrado(int i, int j){
        try{
            tabuleiro[i][j].setFoiAcertado(true);
            return tabuleiro[i][j];
        }catch(Exception e){
            System.out.println("O tabuleiro é 7X7, por favor respeite seu Tamanho");
        }
        return null;
    }
    
    public void mostrarTabuleiro(){
        System.out.println("  1 2 3 4 5 6 7");
        for(int i = 0; i < 7; i++){
            System.out.print((i + 1) + " ");
            for(int j = 0; j < 7; j++){
                tabuleiro[i][j].mostrar();
            }
              System.out.println();
          }
    }
    
    public void revelarTabuleiro(){
        for(int i = 0; i < 7; i++){
            for(int j = 0; j < 7; j++){
                tabuleiro[i][j].setFoiAcertado(true);
            }
          }
        mostrarTabuleiro();
    }
    
    public int[] getNavio3x1() {
        return navio3x1;
    }
    public void setNavio3x1(int[] navio3x1) {
        this.navio3x1 = navio3x1;
    }
      public Quadrado[][] getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(Quadrado[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public int[] getNavio2x1() {
        return navio2x1;
    }

    public void setNavio2x1(int[] navio2x1) {
        this.navio2x1 = navio2x1;
    }
}