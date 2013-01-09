package utility;

/**
 *
 * @author Jannik
 */
public class Player {

    
    private String name;
    private Town town;
   
   public Player(String name) {
        this.name = name;
        town = new Town();
    } 
    
}
