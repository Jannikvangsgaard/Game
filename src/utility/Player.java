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
   public int getLInf(){
       return town.getLInf();
   }
   public int getHInf(){
       return town.getHInf();
   }
   public int getLCav(){
       return town.getLCav();
   }
   public int getHCav(){
       return town.getHCav();
   }
   public String getName(){
       return name;
   }
}
