import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTests {

	public void printNumbersFrom1To100() {
        assertEquals(FizzBuzz.of(0), ("0"));
    }
	
	public void multipleOfThreeReturnFizz(){
        assertEquals(FizzBuzz.of(3), "Fizz");
    }
	
	public void multipleOfFiveReturnBuzz(){
        assertEquals(FizzBuzz.of(5), "Buzz");
    }
	
	public void multipleOfFiveAndThreeReturnFizzBuzz(){
        assertEquals(FizzBuzz.of(15), "FizzBuzz");
    }

}
