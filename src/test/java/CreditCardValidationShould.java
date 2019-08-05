import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;

@RunWith(JUnitParamsRunner.class)
public class CreditCardValidationShould {

    @Parameters({
            "00000000000"
    })
    @Test
    public void is_valid(String creditCardNumber) {
        CreditCardValidation creditCardValidation = new CreditCardValidation();

        assertTrue(creditCardValidation.isValid(creditCardNumber));
    }
}
