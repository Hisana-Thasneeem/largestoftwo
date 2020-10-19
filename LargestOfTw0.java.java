//TRV19ECO32
//Hisana Thasneem
import java.util.Scanner;
public class LargestOfTwo
{
  public static void main(String[] args)
  {
    int a,b;
    int lar;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first number: ");
    a = sc.nextInt();
    System.out.print("Enter second number: ");
    b = sc.nextInt();
    if(a>b)
        lar=a;
    else
        lar=b;
    System.out.print("Largest number is:  "+ lar);
  }
}