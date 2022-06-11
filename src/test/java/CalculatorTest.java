/*
#Added a Java Test File for Demonstration of Code Coverage Percentage update on SonarCloud Dashboard
#By ASecurityGuru
#5/11/2022 11:14 AM IST
*/

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	@Test
    public void verifyAdditionOne() {

		Calculator calculator = new Calculator();
        int sum = calculator.addition("5+2");
        assertEquals(7, sum);
    }
	
	@Test
    public void verifyAdditionTwo() {

		Calculator calculator = new Calculator();
        int sum = calculator.addition("13+27");
        assertEquals(40, sum);
    }
}
