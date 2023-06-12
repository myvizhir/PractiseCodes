import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner in = new Scanner(System.in);
	   int n=in.nextInt();
	   int i=0,m=0,a=0,res=0;
	   while(n>0){
	       m=n%10;
	       n=n/10;
	       res=res+(m*m*m);
	       System.out.print(res+" ");
	   }
	   System.out.println(res);
	}
}