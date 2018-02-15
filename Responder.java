import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
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
    private HashMap<HashSet<String>,String>respuestass;
    /**
     * Construct a Responder - nothing to do
     * Introducir una palabra 
     */
    public Responder()
    {
        aleatorio= new Random();
        respuestass=new HashMap<>();

        respuestaPorDefecto();
        HashSet<String> palabra1= new HashSet<>();
        palabra1.add("free");
        palabra1.add("app");

        HashSet<String> palabra2= new HashSet<>();
        palabra2.add("free");

        HashSet<String> palabra3= new HashSet<>();
        palabra3.add("app");

        HashSet<String> palabra4= new HashSet<>();
        palabra4.add("linux");
        palabra4.add("problem");
        palabra4.add("crash");

        respuestass.put(palabra1, "Consulta nuestra app deportiva durante esta semana gratis");
        respuestass.put(palabra2, "Podemos ofrecer un sistema operativo gratis");
        respuestass.put(palabra3, "Descarga nuestra app");
        respuestass.put(palabra4, "Problemas frecuentes de Linux");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     * Contesta una frase relacionada con dicha palabra. 
     */
    public String generateResponse(HashSet<String> inputUser)
    {
        String response=null;
        response =respuestass.get(inputUser);
        if(response==null){
            if(respuestas.size() > 0){
                response=respuestas.remove(aleatorio.nextInt(respuestas.size()));
            }else{
                System.out.println("No he entendido tu respuesta");
            }
            
        }
        return response;
    }
    
    public void respuestaPorDefecto(){
        respuestas=new ArrayList<String>();
        respuestas.add("Podrias darme mas detalles del problema que tienes?");
        respuestas.add("De que marca es tu ordenador?");
        respuestas.add("Eso no es un error es una característica");
        respuestas.add("Que le ocurre al ordenador?");
        respuestas.add("Cual es tu sistema operativo?");
    }
}
