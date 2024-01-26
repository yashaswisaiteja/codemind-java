import java.util.Scanner;
public class Character{
    public static void main(String args[]){
        char ch;
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);
        int ascii=(int)ch;
        System.out.println(ascii);
    }
}