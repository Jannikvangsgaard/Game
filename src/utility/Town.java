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

    public Boolean convertSoldiers(int[] sol) {
        int tot = 0;
        for (int i = 0; i < 4; i++) {
            tot = tot + sol[i];
        }
        if (soldiers[0] - sol[0] > 0 && soldiers[1] - sol[1] > 0 && soldiers[2] - sol[2] > 0 && soldiers[3] - sol[3] > 0) {
            civilian = civilian + tot;
            return true;
        }
        return false;
    }

    public Boolean trainSoldiers(int[] civ) {
        int tot = 0;
        for (int i = 0; i < 4; i++) {
            tot = tot + civ[i];
        }
        if (civilian - tot > 1) {
            civilian = civilian - tot;
            for (int i = 0; i < 4; i++) {
                soldiers[i] += civ[i];
            }
        }

        return false;

    }
}
