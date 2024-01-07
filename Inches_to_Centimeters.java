import java.util.Scanner;
public class Conversion
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double height=sc.nextDouble();
        double conver=2.54*height;
        System.out.printf("%.2f",conver);
    }
}