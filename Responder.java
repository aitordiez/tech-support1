import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
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
    private HashMap<String,String>respuestass;
    /**
     * Construct a Responder - nothing to do
     * Introducir una palabra 
     */
    public Responder()
    {
        respuestas=new ArrayList<String>();
        aleatorio= new Random();
        respuestass=new HashMap<>();
        
        respuestas.add("Podrias darme mas detalles del problema que tienes?");
        respuestas.add("De que marca es tu ordenador?");
        respuestas.add("Eso no es un error es una característica");
        respuestas.add("Que le ocurre al ordenador?");
        respuestas.add("Cual es tu sistema operativo?");
        
        respuestass.put("windows", "Fecha de la ultima actualizacion");
        respuestass.put("internet", "Compruebe su router");
        respuestass.put("wifi", "Compruebe su zona Wifi");
        respuestass.put("proyector", "Compruebe la lampara del proyector");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     * Contesta una frase relacionada con dicha palabra. 
     */
    public String generateResponse(HashSet<String> inputUser)
    {
        String response=null;
        String palabrass= "";
        for(String palabra : inputUser){
            palabrass=palabra;
        }
        response=respuestass.get(palabrass);
         
        if(response==null){
            response=respuestas.get(aleatorio.nextInt(respuestas.size()));
        }
        return response;
    }
}
