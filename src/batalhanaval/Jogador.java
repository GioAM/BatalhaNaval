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
public class Jogador{
   private String nome;
   private boolean acertou;
   
   public Jogador(){
       acertou = false;
   }
   public void acertouNavio(Quadrado[][] tabela, int[] posicoes){
       switch (posicoes.length) {
           case 4:
               if(tabela[posicoes[0]][posicoes[1]].foiAcertado()== true && tabela[posicoes[2]][posicoes[3]].foiAcertado() == true){
                   this.setAcertou(true);
               }   break;
           case 6:
               if(tabela[posicoes[0]][posicoes[1]].foiAcertado() == true && tabela[posicoes[2]][posicoes[3]].foiAcertado() == true && tabela[posicoes[4]][posicoes[5]].foiAcertado() == true){
                   this.setAcertou(true);
               }   break;
           case 8:
               if(tabela[posicoes[0]][posicoes[1]].foiAcertado() == true && tabela[posicoes[2]][posicoes[3]].foiAcertado() == true && tabela[posicoes[4]][posicoes[5]].foiAcertado() == true && tabela[posicoes[6]][posicoes[7]].foiAcertado() == true ){
                   this.setAcertou(true);
               }   break;
           default:
               break;
       }
    }

    public String jogada(Quadrado quadrado){
        String acertouQuadrado;
        try{
            if(quadrado.getEmbaixo() == 'X'){
                acertouQuadrado = "Parabéns! Você acertou.";
            }else{
                acertouQuadrado = "Não foi dessa vez. Tente Novamente";
            }
            return acertouQuadrado;
        }catch(NullPointerException e){
            return "";   
        }
    }   
   
    public boolean isAcertou() {
        return acertou;
    } 

    public void setAcertou(boolean acertou) {
        this.acertou = acertou;
    }
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
   
   
    
}
