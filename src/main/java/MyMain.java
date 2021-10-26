import java.util.Scanner;

public class MyMain {

    // Generates a random number between 10 and 20, inclusive
    public static int randomTeen() {
        int x = (int) (Math.random()*11) + 10;
        return x;
    }

    // Use your previous method to generate three random numbers between 10 and 20, inclusive.
    // Your program should print out the three numbers, as well as the largest and smallest
    // values of the three.
    // Example of running your code:
    // The three random numbers are 20, 14, and 10
    // The largest number is 20
    // The smallest number is 10
    public static void main(String[] args) {
//        int w = randomTeen();
//        int x = randomTeen();
//        int y = randomTeen();
//        int z = randomTeen();
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);
//        System.out.println(Mathey.max(x, y, z));
//        System.out.println(Mathey.max(x, y));
//        System.out.println(Mathey.max(w,x,y,z));
//        System.out.println(Mathey.randomInteger(x));
//        System.out.println(Mathey.randomInteger(x, y));
//
//
//
//
//
//         // Uncomment this code later!
         System.out.println("Mathey.max tests");
         System.out.println(Mathey.max(1, 2));
         System.out.println(Mathey.max(2, 1));

        System.out.println("Mathey.RandomInteger tests");
        System.out.println(Mathey.randomInteger(3,8));
        System.out.println(Mathey.randomInteger(1,6));

        System.out.println("Mathey.pow tests");
        System.out.println(Mathey.pow(3,6));
        System.out.println(Mathey.pow(2,5));

        System.out.println("Mathey.abs tests");
        System.out.println(Mathey.abs(5));
        System.out.println(Mathey.abs(-2));

        System.out.println("Mathey.round tests");
        System.out.println(Mathey.round(6.9));
        System.out.println(Mathey.round(4.1));

        System.out.println("Mathey.floor tests");
        System.out.println(Mathey.floor(2.5));
        System.out.println(Mathey.floor(9.2));

        System.out.println("Mathey.ceil tests");
        System.out.println(Mathey.ceil(6.7));
        System.out.println(Mathey.ceil(9.01));

        System.out.println("Mathey.sqrt tests");
        System.out.println(Mathey.sqrt(9));
        System.out.println(Mathey.sqrt(16));

        System.out.println("Mathey.pythag tests");
        System.out.println(Mathey.pythag(3,4));
    }

}


