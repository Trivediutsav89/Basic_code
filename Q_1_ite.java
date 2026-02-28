import java.util.Scanner;
public class Q_1_ite {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");

        int n = sc.nextInt();

        for(int i=1; i<=n/2; i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
            }
        }
    }
}
