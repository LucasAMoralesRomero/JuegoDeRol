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
    //el int turno nos permite determinar de quien es el turno de atacar
    int turno = 1;
    //los datos de charmnander y de rattata se obtienen de la wiki de pokemon
    //http://es.pokemon.wikia.com
    Player1.SetNombre("Charmander");
    Player1.SetVida(100);
    Player1.SetNombreAtaque1("Arañazo");
    Player1.SetAtaque1(40);
    Player1.SetNombreAtaque2("Gruñido");
    Player1.SetAtaque2(0);
    
    Player2.SetNombre("Rattata");
    Player2.SetVida(100);
    Player2.SetNombreAtaque1("Placaje");
    Player2.SetAtaque1(35);
    Player2.SetNombreAtaque2("Latigo");
    Player2.SetAtaque2(1);
    
    while (Player1.vida > 0 & Player2.vida > 0) 
    {
        if (turno == 1) 
        {
        System.out.println("Turno de ataque para " + Player1.GetNombre());
        Player2.SetVida(Player2.GetVida()-(CalcularAtaque(Player2.GetAtaque1())));
            System.out.println(Player2.GetVida());
        }
    
    }
    
    
    }
    
    public static double CalcularAtaque(double ataque)
    {
    /*CalcularAtaque calcula el ataque en base a la formula de ataque de 
    poquemon extraida da la web http://es.pokemon.wikia.com/wiki/Daño 
     */ 
     Random aleatorio = new Random();
     double[] efectividad ={0.0,0.25,0.5,1.0,2.0,4.0};
     double variacion = ThreadLocalRandom.current().nextDouble(85, 100+1);
     ataque = (0.1*efectividad[aleatorio.nextInt(6)]*variacion)*(0.2*1+1*1*ataque)/(25)+2; 
    return ataque;
    }
}
