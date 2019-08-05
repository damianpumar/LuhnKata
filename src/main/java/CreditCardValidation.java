public class CreditCardValidation {
    public boolean isValid(String creditCardNumber) {
        int sum = getSumS1(creditCardNumber) + getSumS2(creditCardNumber);

        return String.valueOf(sum).endsWith("0");
    }

    private int getSumS2(String creditCardNumber) {
        int sum = 0;

        char[] charArray = creditCardNumber.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (!(isOdd(i)))
                continue;

            sum += sumEachDigit(multiply(charArray[i]));
        }

        return sum;
    }

    private int getSumS1(String creditCardNumber) {
        int sum = 0;

        char[] charArray = creditCardNumber.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (isOdd(i))
                continue;

            sum += Character.getNumericValue(charArray[i]);
        }

        return sum;
    }

    private int multiply(Character number) {
        return Character.getNumericValue(number) * 2;
    }

    private int sumEachDigit(int number) {
        int sum = 0;

        for (Character digit : String.valueOf(number).toCharArray())
            sum += Character.getNumericValue(digit);

        return sum;
    }

    private boolean isOdd(int position) {
        return (position + 1) % 2 == 0;
    }
}
