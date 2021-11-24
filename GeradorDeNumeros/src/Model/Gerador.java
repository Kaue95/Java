
package Model;

import java.util.Random;
import javax.swing.JOptionPane;


public class Gerador {
    public static int jogo=6;
    public static int [] vet = new int[jogo];
    public static void megasena(){
        int i;
        
        Random gera = new Random();
        for(i=0;i<jogo;i++){
            vet[i] = gera.nextInt(60+1);
            
          }
    }
    public static void quina(){
        int i, jogo = 5;
        Random gera = new Random();
        for(i=0;i<jogo;i++){
            vet[i] = gera.nextInt(80+1);
    
 }
}
   

