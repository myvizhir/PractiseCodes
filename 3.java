import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner in = new Scanner(System.in);
	   int number1 = in.nextInt();
	   int number2 = in.nextInt();
	   char operator = in.next().charAt(0);
	   int result =0;
	   switch (operator) {
	       case '+':
	           result = number1+number2;
	           break;
	       case '-':
	           result = number1 - number2;
	           if(result <0){
	               result = number2 - number1;
	           }
	           break;
	   }
	   System.out.println(result);
	}
}