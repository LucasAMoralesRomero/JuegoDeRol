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
    public float vida = 100;
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

    public void SetVida (float vida)
    {
    this.vida = vida;
    }
    
    public float GetVida()
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
    
    public void SetAtaque1(int ataque1)
    {
    this.ataque1 = ataque1;
    }
    
    public int GetAtaque1()
    {
    return ataque1;
    }
    
    public void SetAtaque2(int ataque2)
    {
    this.ataque2 = ataque2;
    }
    
    public int GetAtaque2()
    {
    return ataque2;
    }
    
}
