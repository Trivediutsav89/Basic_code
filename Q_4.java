import java.util.Scanner;
public class Q_4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        int n = sc.nextInt();
        if((n ^ 1)> n)  // and also we can use (n & 1==0) cause it directly compare 1 with LSB of n
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("odd");
        }
    }
}
