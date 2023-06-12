//Write a Java program to reverse a given string with preserving the position of spaces?

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> al= new ArrayList<Integer>();
		String userinput= in.nextLine();
		String strarr[]=userinput.split(""); 
		for(int i=0;i<strarr.length;i++){
	        if(strarr[i].equals(" ")){
	            al.add(i);
	        }
	    }
	    String reverse ="";
	    for(int j=strarr.length-1;j>=0;j--){
	        if(!strarr[j].equals(" "))
	            reverse=reverse+strarr[j];
	    }
	    for(int k=0,x=0;k<userinput.length();k++){
	        if(al.contains(k))
	            System.out.print(" ");
	        else
	            System.out.print(reverse.charAt(x++));
	    }
	}
}
