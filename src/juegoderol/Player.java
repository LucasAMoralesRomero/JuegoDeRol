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
    public double vida = 100;
    public String NombreAtaque1;
    public double ataque1;
    public String NombreAtaque2;
    public double ataque2;
    //imagen guarda la ruta de la imagen del pesonaje
    public String imagen;
    
    public void SetNombre (String nombre)
    {
    this.nombre = nombre;
    }
    
    public String GetNombre()
    {
    return nombre;
    }

    public void SetVida (double vida)
    {
    this.vida = vida;
    }
    
    public double GetVida()
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
    
    public double GetAtaque1()
    {
    return ataque1;
    }
    
    public void SetAtaque2(int ataque2)
    {
    this.ataque2 = ataque2;
    }
    
    public double GetAtaque2()
    {
    return ataque2;
    }
    
    public void SetImagen (String imagen)
    {
    this.imagen = imagen;
    }
    
    public String GetImagen()
    {
    return imagen;
    }
}
