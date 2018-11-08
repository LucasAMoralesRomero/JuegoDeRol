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
    
    public void SetNombreAtaque1 (String nombreataque1)
    {
    this.NombreAtaque1 = nombreataque1;
    }
    
    public String GetNombreAtaque1()
    {
    return NombreAtaque1;
    }
    
    public void SetNombreAtaque2 (String nombreataque2)
    {
    this.NombreAtaque2 = nombreataque2;
    }
    
    public String GetNombreAtaque2()
    {
    return NombreAtaque2;
    }
}
