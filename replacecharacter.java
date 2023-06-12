import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner in = new Scanner(System.in);
	   String str=in.nextLine();
	   //System.out.println(str.replace("i","S"));
	   String str1[]=str.split("");
	   String result="";
	   for(int i=0;i<str1.length;i++){
	       if(str1[i].equals("i") ||str1[i].equals("?")){
	           result = result+"S";
	       }
	       else{
	           result = result+str1[i];
	       }
	   }
	   System.out.println(result);
	}
}