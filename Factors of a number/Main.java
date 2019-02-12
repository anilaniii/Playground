import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in =new Scanner(System.in);
      int num=in.nextInt();
      for(int fac=1; fac<=num; fac++)
      {
        if(num%fac ==0)
          
        {
          System.out.println(fac);
        }
	}
}
}