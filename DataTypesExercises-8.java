import java.util.Scanner;

public class DataTypesExercises8 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the side length value: ");
        double val = in.nextDouble();

        System.out.printf("Square: %12.2f\n", Math.pow(val, 2));
        System.out.printf("Cube: %14.2f\n", Math.pow(val, 3));
        System.out.printf("Fourth power: %6.2f\n", Math.pow(val, 4));
    }
}
