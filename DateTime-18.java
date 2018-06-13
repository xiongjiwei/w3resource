public class DateTime18 {

    public static void main(String[] args)
    {
        int year = 2018;
        System.out.println();
        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
            System.out.println("Yes");
        else
            System.out.println("No");
        System.out.println();
    }
}
