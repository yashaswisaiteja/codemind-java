import java.util.Scanner;
public class Average
{
    public static void main(String[] args)
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        float avg=((float)a+b)/2;
        System.out.printf("%.4f",avg);
    }
}