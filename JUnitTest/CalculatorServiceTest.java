import org.junit.jupiter.api.Test;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

public class CalculatorServiceTest {
    @Test
    public void addTwoNumbersTest(){
        int result = CalculatorService.addTwoNumbers(12, 90);

        int expected = 102;
        Assert.assertEquals(expected, result);
        
    }

    @Test
    public void sumNumbersTest(){
        int result = CalculatorService.sumNumbers(1,2,3,4,5,6,7,8,9,10);
        int expected = 55;

        Assert.assertEquals(expected, result);
    }
}
