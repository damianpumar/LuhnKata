import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(JUnitParamsRunner.class)
public class CreditCardValidationShould {

    @Parameters({
            "00000000000",
            "50505050505",
            "32300000000",
            "61789372994"
    })
    @Test
    public void is_valid(String creditCardNumber) {
        CreditCardValidation creditCardValidation = new CreditCardValidation();

        assertTrue(creditCardValidation.isValid(creditCardNumber));
    }

    @Parameters({
            "00000000001",
            "55500000000",
            "03500000005",
            "37300000000"
    })
    @Test
    public void is_invalid(String creditCardNumber) {
        CreditCardValidation creditCardValidation = new CreditCardValidation();

        assertFalse(creditCardValidation.isValid(creditCardNumber));
    }
}
