/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoderol;
import java.util.Random;
//clase donde se define el player
import juegoderol.Player;
//importo la clase threadlocalrandom (genera un numero aleatorio entre a y b)
import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author Lucas A. Morales Romero
 */
public class JuegoDeRol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Player Player1 = new Player();
    Player Player2 = new Player();
    Player1.SetNombre("Charmander");
    Player1.SetVida(100);
    }
    
    public Double CalcularAtaque(Double ataque)
    {
    /*CalcularAtaque calcula el ataque en base a la formula de ataque de 
    poquemon extraida da la web http://es.pokemon.wikia.com/wiki/Daño 
     */ 
     Random aleatorio = new Random();
     Double[] efectividad ={0.0,0.25,0.5,1.0,2.0,4.0};
     Double variacion = ThreadLocalRandom.current().nextDouble(85, 100+1);
     ataque = (0.1*efectividad[aleatorio.nextInt(6)]*variacion)*(0.2*1+1*1*ataque)/(25)+2; 
    return ataque;
    }
}
