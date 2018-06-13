import java.util.Scanner;

public class DataTypesExercises10 {
    public static void main(String[] args) {
        System.out.print("nput six non-negative digits:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String str = String.valueOf(num);

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
        }
    }
}
