import java.util.Scanner;
public class Modulus
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int mod=a%b;
        System.out.println(mod);
    }
}