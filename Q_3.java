import java.util.Scanner;
public class Q_3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int countEven = 0;
        int countOdd = 0;
        while(n!=0)
        {
            int rem = n % 10;
            if(rem % 2 == 0)
            {
                countEven++;
            }
            else
            {
                countOdd++;
            }
            n = n / 10;  // don't forget to do this silly mistake 
        }
        System.out.println("Even digits:"+ countEven);
        System.out.println("Odd digits:"+ countOdd);
    }
}
