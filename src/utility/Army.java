package utility;

/**
 *
 * @author Jannik
 */
public class Army {
    
    boolean onlyCav = false;
    
    
    
    public boolean ifOnlyCav(int[] army){
        if (army[0]==0&&army[1]==0){
            boolean onlyCav = true;
            return true;
        }
        
        
        
        return false;
    }
    
}
