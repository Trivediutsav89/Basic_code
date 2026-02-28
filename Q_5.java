import java.util.Scanner;
public class Q_5 {
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number for lower range");
        int n1 = sc.nextInt();

        System.out.println("Enter the number for upper range");
        int n2 = sc.nextInt();

        for(int i=n1; i<=n2; i++)
        {
            if(isPrime(i))
            {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        for(int i=2; i<=n/2; i++)
        {
            if(n%i==0)
            {
                return false;
            }

        }
        return true;
    }
}
