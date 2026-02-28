import java.util.Scanner;
import java.lang.Math;
public class Q_6 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n =sc.nextInt();

        int original = n;
        int count = 0;
        int sum =0;

        int temp = n;
        while(temp > 0)
        {
            count++; // if we don't increase count here rather than after dividing we got wrong answer
            temp = temp / 10;
        }

        temp = n;
        while(temp > 0)
        {
            int digit = temp % 10;
            sum = sum + (int)Math.pow(digit, count); // cause math auto return double 
            temp = temp / 10;
        }
        if(sum == original)
        {
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an armstrong number");
        }
        }
    }


