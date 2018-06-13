import java.util.Scanner;

public class DataTypesExercises4 {
    public static void main(String[] args) {
        
        System.out.print("Input the number of minutes:");
        Scanner sc =  new Scanner(System.in);

        int minutes = sc.nextInt();
        int year = 60*24*365;

        int years = minutes/year;
        int days = minutes/60/24 -365*years;

        System.out.println(minutes+" minutes is approximately "+years+" years and "+days+" days");
    }
}
