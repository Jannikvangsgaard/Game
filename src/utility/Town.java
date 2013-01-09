package utility;

/**
 *
 * @author Jannik
 */
public class Town {
    private int civilian;
    private int[] soldiers = new int[4];
    private int totalGold;

    public Town() {
        civilian = 10;
        totalGold = 10;
    }
    
    public Boolean convertSoldiers(int sol){
        
        if (civilian-sol >1){
            civilian = civilian + sol;
        
            return true;
        }
        
        
        return false;
    }
    
    public Boolean trainSoldiers(int civ){
        
        if (civilian-civ >1){
            civilian = civilian - civ;
            
            
        }
            
        return false;
        
    }
    
    
    
    
}
