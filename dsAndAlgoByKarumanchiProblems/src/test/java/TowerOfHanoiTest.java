import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by swathi on 8/20/2015.
 */
public class TowerOfHanoiTest {
    TowerOfHanoi towerOfHanoi = new TowerOfHanoi();

    @Test
    public void shouldGiveTheMoves(){
        towerOfHanoi.solveTowerOfHanoi(3 , 'A', 'B' , 'C' );
    }

}