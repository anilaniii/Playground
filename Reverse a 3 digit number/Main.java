import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in=new Scanner (System.in);
    int n=in.nextInt();
    int f=n/100;
    int s=(n/10)%10;
    int t=n%10;
    int reverse =t*100+s*10+f*1;
    System.out.println(reverse);
    
  }
}