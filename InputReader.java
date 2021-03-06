import java.util.HashSet;
import java.util.Scanner;

/**
 * InputReader reads typed text input from the standard text terminal. 
 * The text typed by a user is returned.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class InputReader
{
    private Scanner reader;

    /**
     * Create a new InputReader that reads text from the text terminal.
     */
    public InputReader()
    {
        reader = new Scanner(System.in);
    }

    /**
     * Modifica el m�todo getInput para que devuelva la primera de las palabras
     * introducidas por el usuario
     */
    public HashSet<String> getInput()
    {
        System.out.print("> ");         // print prompt
        String inputLine = reader.nextLine();
        inputLine.length();
        HashSet<String>words=new HashSet<>();
        String[] array=inputLine.split(" ");
        for(int i=0; i < array.length; i++){
            words.add(array[i]);
        }
        return words;
    }
}
