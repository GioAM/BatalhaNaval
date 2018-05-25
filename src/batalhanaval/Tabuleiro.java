package batalhanaval;

/**
 *
 * @author giovani.meneguel
 */
public class Tabuleiro {
    
    Quadrado[][] tabuleiro;
    Navio navio = new Navio();
    
    public Tabuleiro(){
        tabuleiro = new Quadrado[7][7];
        for(int i = 0; i < 7; i++){
           for(int j = 0; j < 7; j++){
               tabuleiro[i][j] = new Quadrado();
           }
       }
       navio.adicionarNavio2X1(tabuleiro);
       navio.adicionarNavio2X1(tabuleiro);
       navio.adicionarNavio2X1(tabuleiro);
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
