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
    
   public int getGold(){
       return town.getGold();
   }
   public String getName(){
       return name;
   }
}
