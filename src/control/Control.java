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
    public void train(int sol, int sol2, int sol3, int sol4){
        player.train(sol,sol2,sol3,sol4);
    }
    
}
