import java.util.Scanner;
public class bobby
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        int s = obj.nextInt();
        int b = obj.nextInt();
        System.out.print(t*s*b*2*512);

    }
}