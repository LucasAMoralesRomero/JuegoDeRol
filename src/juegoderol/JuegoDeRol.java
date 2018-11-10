/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoderol;
//la salida del programa sera tanto grafica por joptionpane como por consola
import javax.swing.JOptionPane;
//permite cargar una imagen personalizada joptionpane
import javax.swing.ImageIcon;
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
    //los datos de charmander y de rattata se obtienen de la wiki de pokemon
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
        //RandomizeAtaque va a almacena un valor aleatorio 
        //para seleccionar entre los dos ataques disponibles
        int RandomizeAtaque = ThreadLocalRandom.current().nextInt(1, 2+1);
        if (RandomizeAtaque == 1)
                {
                    System.out.println(Player1.GetNombre() + " atacara con ataque: " + Player1.GetNombreAtaque1() );
                    Player2.SetVida(Player2.GetVida()-(CalcularAtaque(Player1.GetAtaque1())));
                    System.out.println(Player2.GetVida());
                }
        else
                {
                System.out.println(Player1.GetNombre() + " atacara con ataque: " + Player1.GetNombreAtaque2() );
                    Player2.SetVida(Player2.GetVida()-(CalcularAtaque(Player1.GetAtaque2())));
                    System.out.println(Player2.GetVida());
                }
        //cambio de turno
        turno =0;
        //cheque vida de player atacado, si es menor a cero ajusto a cero
        if(Player2.GetVida() < 0)
            {
            Player2.SetVida(0);
            }
        }
    else
        {
        System.out.println("Turno de ataque para " + Player2.GetNombre());
        //RandomizeAtaque va a almacena un valor aleatorio 
        //para seleccionar entre los dos ataques disponibles
        int RandomizeAtaque = ThreadLocalRandom.current().nextInt(1, 2+1);
        if (RandomizeAtaque == 1)
                {
                    System.out.println(Player2.GetNombre() + " atacara con ataque: " + Player2.GetNombreAtaque1() );
                    Player1.SetVida(Player1.GetVida()-(CalcularAtaque(Player2.GetAtaque1())));
                    System.out.println(Player1.GetVida());
                }
        else
                {
                System.out.println(Player2.GetNombre() + " atacara con ataque: " + Player2.GetNombreAtaque2() );
                    Player1.SetVida(Player1.GetVida()-(CalcularAtaque(Player2.GetAtaque2())));
                    System.out.println(Player1.GetVida());
                }
        //cambio de turno
        turno =1;
        //cheque vida de player atacado, si es menor a cero ajusto a cero
        if(Player1.GetVida() < 0)
            {
            Player1.SetVida(0);
            }
        
        }
    
    }
    
    if (Player1.GetVida() == 0)
    {
        System.out.println("El ganador de la batalla fue: " + Player2.GetNombre());
        System.out.println("Vida de " + Player1.GetNombre() + ": " + Player1.GetVida());
        System.out.println("Vida de " + Player2.GetNombre() + ": " + Player2.GetVida());
    }
    else
    {
        System.out.println("El ganador de la batalla fue: " + Player1.GetNombre());
        System.out.println("Vida de " + Player1.GetNombre() + ": " + Player1.GetVida());
        System.out.println("Vida de " + Player2.GetNombre() + ": " + Player2.GetVida());
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
