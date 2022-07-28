package homework_13;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        ByCondition condition = number -> number % 2 == 0;
        ByCondition condition1 = number -> ((number / 10) + (number % 10)) % 2 == 0;
        ByCondition condition2 = number -> number > 20;
        int[] numbers = {10, 15, 20, 25, 30, 35};
        System.out.println(Arrays.toString(Sequence.filter(numbers, condition)));
        System.out.println(Arrays.toString(Sequence.filter(numbers, condition1)));
        System.out.println(Arrays.toString(Sequence.filter(numbers, condition2)));
    }
}