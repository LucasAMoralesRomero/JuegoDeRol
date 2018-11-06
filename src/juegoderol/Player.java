/*
Esta clase posee los datos de un player
 */
package juegoderol;

/**
 *
 * @author Lucas A. Morales Romero
 */
public class Player {

    public String nombre;
    public int vida = 100;
    public String NombreAtaque1;
    public int ataque1;
    public String NombreAtaque2;
    public int ataque2;
    
    public void SetNombre (String nombre)
    {
    this.nombre = nombre;
    }
    
    public String GetNombre()
    {
    return nombre;
    }

    public void SetVida (int vida)
    {
    this.vida = vida;
    }
    
    public int GetVida()
    {
    return vida;
    }
}
