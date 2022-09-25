package main;

public class Main {
    public static void main(String [] args) {
        System.out.println(sumOfDigits(999));
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        if (number>0 && number<1000) {
            while (number != 0) {
                sum = sum + number % 10;
                number = number / 10;
            }
        }
        return sum;
    }

}
