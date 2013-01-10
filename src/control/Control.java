package control;

import utility.Player;

/**
 *
 * @author Jannik
 */
public class Control {
    private Player player;
    
    
    
    
    public Player createPlayer(String name){
        player = new Player(name);
        return player;
    }
    public int getGold(){
       return player.getGold();
    } 
    
    
}
