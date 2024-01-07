import java.util.Scanner;
public class Sphere
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double r=sc.nextDouble();
        double pi=3.14;
        double vol=((double)4/3)*pi*(r*r*r);
        System.out.printf("%.2f",vol);
    }
}