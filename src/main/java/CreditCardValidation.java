public class CreditCardValidation {
    public boolean isValid(String creditCardNumber) {
        int sum = 0;

        sum += getSumS1(creditCardNumber);

        sum += getSumS2(creditCardNumber);

        return String.valueOf(sum).endsWith("0");
    }

    private int getSumS2(String creditCardNumber) {
        int sum = 0;

        char[] charArray = creditCardNumber.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            Character number = charArray[i];

            sum += Character.getNumericValue(number);
        }

        return sum * 2;
    }

    private int getSumS1(String creditCardNumber) {
        int sum = 0;

        char[] charArray = creditCardNumber.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if ((i + 1) % 2 == 0)
                continue;

            Character number = charArray[i];

            sum += Character.getNumericValue(number);
        }

        return sum;
    }
}
