package control;

import utility.Player;

/**
 *
 * @author Jannik
 */
public class Control {
    private Player player;
    private int rest;
  
    
    public Player createPlayer(String name){
        player = new Player(name);
        return player;
    }
    public int getGold(){
       return player.getGold();
    } 
    public void train(int sol, int sol2, int sol3, int sol4){
        player.train(sol,sol2,sol3,sol4);
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
    
}
}
