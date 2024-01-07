import java.util.Scanner;
public class Floating
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float mul=a*b;
        System.out.printf("%.2f",mul);
    }
}