import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner in = new Scanner(System.in);
	   int n=in.nextInt();
	   int k=0,count=0;
	   for(int i=2;i<=n/2;i++){
	       if(n==0 || n==1 || n==2){
	        break;
	       }
	       else{
	           k=n%i;
	           if(k==0){
	               count++;
	           }
	       }
	   }
	   if(count!=0){
	       System.out.println("not prime");
	   }
	   else{
	       System.out.println("prime");
	   }
	}
}