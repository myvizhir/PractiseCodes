import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner in = new Scanner(System.in);
	   String str=in.nextLine();
	   char ch[]=str.toCharArray();
	   for(int i=ch.length-1;i>=0;i--){
	       System.out.print(ch[i]);
	   }
	}
}


import java.util.*;
public class Main
{
	public static void main(String[] args) {
    	Scanner userinput= new Scanner(System.in);
    	String str= userinput.nextLine();
    	System.out.println(reverse(str));
    }
    public static String reverse(String in){
        StringBuilder out = new StringBuilder();
        char ch[]=in.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            out.append(ch[i]);
        }
        return out.toString();
    }
}