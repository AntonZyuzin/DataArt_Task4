package ru.dataart.academy.java;

public class ReverseInteger {
    /**
     * @param inputNumber - any integer value
     * @return - inputNumber in reversed order
     * Example: 1234 -> 4321
     * -23 -> -32
     * 120 -> 21
     * -2,147,483,648 -> exception and error message
     * If result (number in reversed order) is out of int range [-2,147,483,648,  2,147,483,647] throw custom
     * unchecked exception. In main method (Main class) if exception happened output message with problem to user.
     */
    public int reverse(int inputNumber) {
        int startNumber = inputNumber;

        if (startNumber < 0) {
            startNumber *= -1;
        }

        long reverseNumber = 0;
        while (startNumber > 0) {
            reverseNumber *= 10;
            reverseNumber += startNumber % 10;
            startNumber /= 10;
        }

        if (inputNumber < 0) {
            reverseNumber *= -1;
        }

        if (Integer.MIN_VALUE > reverseNumber || reverseNumber > Integer.MAX_VALUE) {
            throw new NumberFormatException("число вышло за пределы int");
        }
        return (int) reverseNumber;
    }
}