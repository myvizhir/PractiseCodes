import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner in = new Scanner(System.in);
	   String str=in.nextLine();
	   String str1[]=str.split(" ");
	   for(int i=0;i<str1.length;i++){
	       String word =str1[i];
	       if(str1[i].equalsIgnoreCase("fox")){
	           //word=word.replace("fox","dog");
	           word="";
	           word+="dog";
	       }
	       System.out.print(word+" ");
	   }
	}
}