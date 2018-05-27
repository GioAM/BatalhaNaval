package batalhanaval;

/**
 *
 * @author giovani.meneguel
 */
public class Tabuleiro {
    
    Quadrado[][] tabuleiro;
    Navio navio = new Navio();
    private int[] navio3x1;
    
    public Tabuleiro(){
        tabuleiro = new Quadrado[7][7];
        for(int i = 0; i < 7; i++){
           for(int j = 0; j < 7; j++){
               tabuleiro[i][j] = new Quadrado();
           }
       }
        
        navio3x1 = navio.adicionarNavio3X1(tabuleiro);
       
    }

    public int[] getNavio3x1() {
        return navio3x1;
    }

    public void setNavio3x1(int[] navio3x1) {
        this.navio3x1 = navio3x1;
    }
    public void mostrarTabuleiro(){
        for(int i = 0; i < 7; i++){
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
   
}
