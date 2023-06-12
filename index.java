import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner in = new Scanner(System.in);
	   String str=in.nextLine();
	   int index = in.nextInt();
	   char ch[]=str.toCharArray();
	   //System.out.println(ch.length);
	   System.out.println(ch[index]);
	}
}