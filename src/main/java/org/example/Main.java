package org.example;
import org.apache.commons.lang3.StringUtils;
import com.addition.Operations;

public class Main {
    public static void main(String[] args) {
        String testText = "Hello, World!";
        String reverseText = StringUtils.reverse(testText);
        System.out.println(reverseText);

        Operations operations = new Operations();
        int x = 10;
        int y = 5;
        int sum = operations.sum(x, y);
        System.out.println(String.format("Sum %d + %d = ", x, y) + sum);

        int subtract = operations.subtract(x, y);
        System.out.println(String.format("Subtract %d - %d = ", x, y) + subtract);

        float divide = operations.divide(x, y);
        System.out.println(String.format("Divide %d / %d = ", x, y) + divide);

        int multiply = operations.multiply(x, y);
        System.out.println(String.format("Multiply %d * %d = ", x, y) + multiply);

    }
}