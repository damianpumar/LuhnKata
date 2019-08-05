public class CreditCardValidation {
    public boolean isValid(String creditCardNumber) {
        int sum = 0;

        for (Character number : creditCardNumber.toCharArray()) {
            sum += Character.getNumericValue(number);
        }

        return String.valueOf(sum).endsWith("0");
    }
}
