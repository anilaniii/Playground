import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      System.out.println(squareofnumber (n));
   
	} 
  public static int squareofnumber(int a)
  {
    int result=a*a;
  return result;
  }
}
