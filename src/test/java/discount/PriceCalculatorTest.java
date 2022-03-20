package discount;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author ff
 */
public class PriceCalculatorTest {
    
    private PriceCalculator calculator;
    
    @Before
    public void setup() {
        calculator = new PriceCalculator();
    }
    
    @Test
    public void total_zero_when_there_are_prices() {
        assertThat( calculator.getTotal(), is(0.0) );
    }
    
    @Test
    public void total_is_the_sum_of_prices() {
        calculator.addPrice(10.2);
        calculator.addPrice(15.7);

        assertThat( calculator.getTotal(), is(25.9) );
    }

    @Test
    public void apply_discount_to_pricess() {
        calculator.addPrice(12.5);
        calculator.addPrice(17.5);
        
        calculator.setDiscount(50);
        
        assertThat( calculator.getTotal(), is(15.0));
    }
    
}
