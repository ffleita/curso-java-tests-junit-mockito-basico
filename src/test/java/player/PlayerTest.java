package player;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class PlayerTest {

    @Test
    public void loses_when_dice_number_is_too_low() {
        
        Dice dice = Mockito.mock(Dice.class);
        
        Mockito.when(dice.roll()).thenReturn(2);
        
        Player player = new Player(dice, 3);
        Assert.assertEquals(false, player.play());
    }
    
    @Test
    public void win_when_dice_number_is_bigger() {
        
        Dice dice = Mockito.mock(Dice.class);
        
        Mockito.when(dice.roll()).thenReturn(4);
        
        Player player = new Player(dice, 3);
        Assert.assertEquals(true, player.play());
    }
    
}
