import java.util.Random;
import java.util.ArrayList;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael KÃ¶lling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    private Random aleatorio;
    private ArrayList<String> respuestas;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        respuestas=new ArrayList<String>();
        aleatorio= new Random();
        
        respuestas.add("Podrias darme mas detalles del problema que tienes?");
        respuestas.add("De que marca es tu ordenador?");
        respuestas.add("Eso no es un error es una característica");
        respuestas.add("Que le ocurre al ordenador?");
        respuestas.add("Cual es tu sistema operativo?");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        int numeroAleatorio=aleatorio.nextInt(5);
        return respuestas.get(numeroAleatorio);
    }
}
