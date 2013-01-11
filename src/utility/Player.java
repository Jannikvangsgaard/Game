package utility;

/**
 *
 * @author Jannik
 */
public class Player {

    
    private String name;
    private Town town;
    private int[] sol =  new int[4];
   
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
   public int getCivilian(){
       return town.getCivilian();
   }
   public void train(int sol1,int sol2, int sol3, int sol4){
       sol[0] = sol1;
       sol[1] = sol2;
       sol[2] = sol3;
       sol[3] = sol4;
       town.trainSoldiers(sol);
   }
}
