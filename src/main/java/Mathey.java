public class Mathey {
    /* Write your own version of the Math.max method
     * Your method should be called max
     * This method should take **two integers** and return the larger integer
     * Ex. max(1, 2) => 2

     * You will need to practice writing the method signature below!
     * public static ...
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED
    public static int max(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }


    /* Write another method called max that takes **two doubles**
     * Ex. max(1.2, 4.0) => 4.0
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED
    public static double max(double x, double y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }


    /* Write another method called max that takes **three integers**
     * Ex. max(1, 4, 2) => 4
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED
    public static int max(int x, int y, int z) {
        return max(max(x, y), z);
    }


    /* Write another method called max that takes **four doubles**
     * Ex. max(1.0, 4.25, 1.3, 2.1) => 4.25
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED
    public static double max(double w, double x, double y, double z) {
        return max(max(max(x, y), z), w);
    }


    /* Write a method that takes **two integers** and generates a random
     * integer between the first integer and the second integer, inclusive
     * you may assume that the first integer is smaller than the second
     * You may use Math.random() here, but you can't use any other Math methods!
     * Ex. randomInteger(1, 4) => 3
     *     randomInteger(1, 4) => 2
     *     randomInteger(1, 4) => 4
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED
    public static int randomInteger(int x, int y) {
        return (int) Math.random() * (1 - y + x) + x;
    }


    /* Write a method that takes **one integer** and generates a random
     * integer between 0 and the integer, inclusive
     * you may assume that the integer is greater than 0
     * Ex. randomInteger(5) => 3
     *     randomInteger(5) => 5
     *     randomInteger(5) => 0
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED
    public static int randomInteger(int x) {
        return (int) (Math.random() * (x + 1));
    }


    // YOU MAY WORK ON THE FOLLOWING METHODS IF YOU FINISH EARLY

    /* Write a method that takes **two integers** and calculates the exponent
     * that you get by raising the first integer to the second integer
     * you may assume that both integers are positive
     * Ex. pow(2, 5) => 32
     *     pow(3, 4) => 81
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED
    public static int pow(int x, int y) {
        int answer = 1;
        for (int i = 1; i <= x; i++) {
            answer *= y;
        }
        return answer;
    }


    /* Write a method that takes **one integer** and returns the
     * absolute value of that integer
     * Ex. abs(2) => 2
     *     abs(-2) => 2
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED
    public static int abs(int x) {
        if (x >= 0) {
            return x;
        } else {
            return x * -1;
        }
    }


    /* Write a method that takes **one double** and returns the
     * integer value that you get by rounding that double
     * You may assume that the integer is positive
     * Ex. round(2.4) => 2
     *     round(2.5) => 3
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED
    public static int round(double x) {
        x += 0.5;
        return (int) x;
    }


    /* Write a method that takes **one double** and returns the
     * floor of that value
     * The floor is defined as the **largest** integer that is **less than**
     * or equal to some value
     * You may assume that the integer is positive
     * Ex. floor(2.4) => 2
     *     floor(2.999999999999) => 2
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED
    public static int floor(double x) {
        return (int) x;
    }


    /* Write a method that takes **one double** and returns the
     * ceiling of that value
     * The ceiling is defined as the **smallest** integer that is **greater than**
     * or equal to some value
     * You may assume that the integer is positive
     * Ex. ceil(2.99999) => 3
     *     ceil(3.01) => 4
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED
    public static int ceil(double x) {
        x += 0.9;
        return (int) x;
    }


    /* Calculates the square root iteratively, using the Babylonian method
     * This method has been provided for you
     */
    public static double sqrt(double x) {
        double x1 = 5;
        double prev = 0;

        while (Math.abs(prev - x1) > 0.0001) {
            prev = x1;
            x1 = (x1 + x / x1) / 2;
        }

        return x1;
    }

    public static int pythag(int a, int b) {
        int d = (a*a) + (b*b);
        int c = (int) (sqrt(d));
        return c;
    }
}