import java.util.*;
public class Alphabetcase
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char s=sc.next().charAt(0);
        if((s&32)==0)
        System.out.println("Upper case");
        else
        System.out.println("Lower case");
    }
}