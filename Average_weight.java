import java.util.Scanner;
public class Weight
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=((3*x)-a-b);
        System.out.println(c);
    }
}