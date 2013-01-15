package utility;

/**
 *
 * @author Jannik
 */
public class Player {

    
    private String name;
    private Town town;
    private int[] sol =  new int[4];
    private int[] civ = new int[4];
    private int rest;
   public Player(String name) {
        this.name = name;
        town = new Town();
    } 
   
   public void counter(){
       town.counter();
   }
   public void build(int i){
       town.build(i);
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
 public void convert(int civ1, int civ2, int civ3, int civ4, int amount){
    if (amount < civ1){
        civ1 = amount;
        civ2 = 0;
        civ3 = 0;
        civ4 = 0;
    } else if (amount > civ1){
        rest = amount - civ1;
        if (rest > civ2){
            amount = rest;
            rest = amount - civ2;
            if (rest > civ3){
                amount = rest;
                rest = amount - civ3;
                if (rest > civ4){
                amount = rest;
                rest = amount - civ4;
            } else if (civ4 > rest){
                civ4 = rest;
            }
            }
            else if (civ3 > rest){
                civ3 = rest;
                civ4 = 0;
            } 
        } 
        else if (civ2 > rest){
            civ2 = rest;
            civ3 = 0;
            civ4 = 0;
        }
    }
    town.convertSoldiers(sol);
}
}
