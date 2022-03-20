package reto2;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTest {
    
    @Test
    public void should_return_fizz_if_is_divisible_by_3() {
    
        assertThat( FizzBuzz.fizzBuzz(6), is("Fizz") );
        assertThat( FizzBuzz.fizzBuzz(9), is("Fizz") );
        assertThat( FizzBuzz.fizzBuzz(12), is("Fizz") );
    }

    @Test
    public void should_return_buzz_if_is_divisible_by_5() {
        
        assertThat( FizzBuzz.fizzBuzz(10), is("Buzz") );
        assertThat( FizzBuzz.fizzBuzz(20), is("Buzz") );
        assertThat( FizzBuzz.fizzBuzz(25), is("Buzz") );
    }
    
    @Test
    public void should_return_fizzbuzz_when_is_divisible_by_3_and_5() {
        
        assertThat( FizzBuzz.fizzBuzz(15), is("FizzBuzz") );
        assertThat( FizzBuzz.fizzBuzz(30), is("FizzBuzz") );
        assertThat( FizzBuzz.fizzBuzz(45), is("FizzBuzz") );
    }
    
    @Test
    public void shoud_return_the_number_when_cant_divide_by_3_or_5() {
        
        assertThat( FizzBuzz.fizzBuzz(2), is("2") );
        assertThat( FizzBuzz.fizzBuzz(4), is("4") );
        assertThat( FizzBuzz.fizzBuzz(8), is("8") );
    }
}
