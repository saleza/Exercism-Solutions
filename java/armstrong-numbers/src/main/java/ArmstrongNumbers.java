class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int sum = 0;
        String stringNumberToCheck = String.valueOf(numberToCheck);

        for (int i = 0; i < stringNumberToCheck.length(); i++) {
            sum += Math.pow(Character.getNumericValue(stringNumberToCheck.charAt(i)), stringNumberToCheck.length());
        }

        return sum == numberToCheck;
    }

}
