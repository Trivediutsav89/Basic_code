import java.util.Scanner;
public class Q_2_rec {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum = sumOfDigits(n);
        System.out.println(sum);
    }

    public static int sumOfDigits(int n)
    {
        if(n==0)
        {
            return 0;
        }
        int rem = n %10;
        return rem + sumOfDigits(n/10);
    }
}
