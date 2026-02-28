import java.util.Scanner;
public class Q_2_ite {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        // for positive number only
        int n = sc.nextInt();
        int sum = 0;
        while(n!=0)
        {
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
