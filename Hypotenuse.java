import java.util.Scanner;
public class Hypo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=Math.sqrt((a*a)+(b*b));
        System.out.printf("%.2f",c);
    }
}