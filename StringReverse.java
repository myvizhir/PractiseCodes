/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner in= new Scanner(System.in);
	String s =in.nextLine();
	String s1[]=s.split(" ");
	for(int i=0;i<s1.length;i++){
	    String a=s1[i].substring(0,1).toUpperCase();
	    a+=s1[i].substring(1);
        System.out.print(a+" ");
	}
	}
}
