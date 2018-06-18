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
public class Quadrado{
    private char agua;
    private char embaixo;
    private boolean foiAcertado;
    
    
    public Quadrado(){
       agua = '~';
       foiAcertado = false;
       embaixo = '*';
    }
    
    public void mostrar(){
        if(foiAcertado() == true){
            System.out.print( getEmbaixo() + " ");
        }else{
            System.out.print(getAgua() + " ");
        }
    }
    
    public char getAgua() {
        return agua;
    }

    public void setAgua(char agua) {
        this.agua = agua;
    }

    public char getEmbaixo() {
        return embaixo;
    }

    public void setEmbaixo(char embaixo) {
        this.embaixo = embaixo;
    }

    public boolean foiAcertado() {
        return foiAcertado;
    }

    public void setFoiAcertado(boolean foiAcertado) {
        this.foiAcertado = foiAcertado;
    }
    
    
    
}
