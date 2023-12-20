package laba_0;

import java.util.Arrays;

public class Variant12 {

    private static final double PI = 3.14;


    /**
     * Calculates the hypotenuse and perimeter of a right-angled triangle.
     *
     * @param legA the length of one leg of the triangle
     * @param legB the length of the other leg of the triangle
     * @return an array containing the hypotenuse and perimeter
     */
    public double[] inputOutputTask(double a, double b) {
        double c = Math.sqrt(a * a + b * b);
        double P = a + b + c;
        return new double[]{c, P};
    }

    /**
     * Reverses an integer number.
     *
     * @param number the given number
     * @return the reversed number
     */
    public int integerNumbersTask(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    /**
     * Checks if all three numbers are positive.
     *
     * @param a the first number
     * @param b the second number
     * @param c the third number
     * @return true if all numbers are positive, false otherwise
     */
    public boolean booleanTask(int a, int b, int c) {
        return a > 0 && b > 0 && c > 0;
    }

    /**
     * Finds the minimum number among three given numbers.
     *
     * @param a the first number
     * @param b the second number
     * @param c the third number
     * @return the minimum number
     */
    public int ifTask(int a, int b, int c) {
        int min = a;

        if (b < min) {
            min = b;
        }

        if (c < min) {
            min = c;
        }

        return min;
    }

    /**
     * Calculates different values based on the specified element number.
     *
     * @param elementNumber the element number (1 - radius, 2 - diameter, 3 - circumference, 4 - area)
     * @param elementValue  the value of the element
     * @return an array containing the calculated values
     */
    public double[] switchTask(int elementNumber, double elementValue) {
        double[] result = new double[4];

        switch (elementNumber) {
            case 1 -> {
                result[0] = elementValue;
                result[1] = 2.0 * elementValue;
                result[2] = 2.0 * PI * elementValue;
                result[3] = PI * elementValue * elementValue;
                break;
            }
            case 2 -> {
                result[0] = elementValue / 2.0;
                result[1] = elementValue;
                result[2] = PI * elementValue;
                result[3] = PI * (elementValue / 2.0) * (elementValue / 2.0);
                break;
            }
            case 3 -> {
                result[0] = elementValue / (2.0 * PI);
                result[1] = elementValue / PI;
                result[2] = elementValue;
                result[3] = (elementValue / (2.0 * PI)) * (elementValue / (2.0 * PI)) * PI;
                break;
            }
            case 4 -> {
                double radius = Math.sqrt(elementValue / PI);
                result[0] = radius;
                result[1] = 2.0 * radius;
                result[2] = 2.0 * PI * radius;
                result[3] = elementValue;
                break;
            }
            default -> System.out.println("Incorrect number");
        }

        return result;
    }

    /**
     * Calculates the product using the specified formula with a for loop.
     *
     * @param n the integer number
     * @return the approximated value of the product
     */
    public double forTask(int n) {
        assert n > 0 : "Argument should be more than zero";

        double product = 1;

        for (int i = 2; i <= n + 1; i++) {
            product *= (1.0 + (i - 1) * 0.1);
        }

        return product;
    }

    /**
     * Finds the largest integer K for which the sum of 1 + 2 + ... + K is less than or equal to N, and returns this sum.
     *
     * @param n the integer number
     * @return an array containing the largest integer K and the sum
     */

    public int[] whileTask(int n) {
        assert (n > 1) : "Argument should be more than zero";
        int sum = 0;
        int k = 0;

        while (sum + k + 1 <= n) {
            k++;
            sum += k;
        }

        return new int[]{k, sum};
    }

    /**
     * Transforms an array by selecting elements with even indices.
     *
     * @param array the input array
     * @return the transformed array containing elements with even indices
     */
    public int[] arrayTask(int[] array) {
        int length = array.length / 2;
        int[] changedArray = new int[length];

        for (int i = 1; i <= length; i++) {
            changedArray[i - 1] = array[i * 2 - 1];
        }
        return changedArray;
    }

    /**
     * Transforms a 2D matrix by reading its elements column-wise in an alternating pattern
     * and stores the transformed elements in a 1D array.
     *
     * @param matrix The input 2D matrix to be transformed.
     * @return A 1D array containing the transformed elements from the matrix.
     */
    public double[] newMatrix(double[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            return new double[0];
        }

        int numRows = matrix.length;
        int numCols = matrix[0].length;
        double[] result = new double[numRows * numCols];
        int resultIndex = 0;

        for (int col = 0; col < numCols; col++) {
            if (col % 2 == 0) {
                for (double[] doubles : matrix) {
                    result[resultIndex++] = doubles[col];
                }
            } else {
                for (int row = numRows - 1; row >= 0; row--) {
                    result[resultIndex++] = matrix[row][col];
                }
            }
        }

        return result;
    }

    public static void main(String... strings) {
        Variant12 variant12 = new Variant12();

        double[] inputOutputResult = variant12.inputOutputTask(3.0, 4.0);
        System.out.println("Hypotenuse c: " + inputOutputResult[0]);
        System.out.println("Perimeter P: " + inputOutputResult[1]);

        int reversedNumber = variant12.integerNumbersTask(12345);
        System.out.println("Reversed number: " + reversedNumber);

        boolean isPositive = variant12.booleanTask(3, 4, 5);
        System.out.println("All numbers are positive: " + isPositive);

        int minNumber = variant12.ifTask(5, 3, 8);
        System.out.println("Minimum number: " + minNumber);

        double[] switchResult = variant12.switchTask(1, 5.0);
        System.out.println("Result for case 1: " + Arrays.toString(switchResult));

        double forResult = variant12.forTask(5);
        System.out.println("Result of the for loop: " + forResult);

        int[] whileResult = variant12.whileTask(10);
        System.out.println("Result of the while loop: " + Arrays.toString(whileResult));

        int[] array = {1, 9, 3, 12, 5, -3};
        int[] arrayResult = variant12.arrayTask(array);
        System.out.println("Result of array transformation: " + Arrays.toString(arrayResult));

        double[][] matrix = {
                {1.0, 2.0, 7.0},
                {13.0, 5.0, 22.0},
                {19.0, 100.0, 9.0}
        };
        double[] matrixResult = variant12.newMatrix(matrix);
        System.out.println("Result of matrix transformation: " + Arrays.toString(matrixResult));

        System.out.println("Done!!!");

    }
}
