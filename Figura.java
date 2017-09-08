/**
 * Esta clase es una superclase para representar las caracteristicas
 * comunes de muchas figuras.
 * 
 * @author Eloy Hdz
 * @version 1.0 (8-sep-17)
 */
public class Figura
{
    protected float area; // area de cada figura
    
    /**
     * Constructor de la clase Figura.
     */
    public Figura()
    {
        area = 0;
    }
    
    /**
     * Calcula el area de la figura
     */
    public void calcularArea()
    {
        System.out.println("No se como calcular el area porque no se de que figura se trata");
    }
    
    public void imprimirArea()
    {
        System.out.println("El area de la figura es: " + area);
    }
} 
