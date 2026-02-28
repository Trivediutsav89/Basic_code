import java.util.Scanner;
public class Q_1_rec {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");

        int n = sc.nextInt();

        factors(n,1);
    }

    public static void factors(int n,int i)
    {
        if(i>n/2)
        {
            return;   // for immediately teriminating function
        }
        if(n%i==0)
        {
            System.out.println(i);
        }
        factors(n, i+1);  
    }
}
