import java.util.*;
public class Main
{
	public static void main(String[] args) {
    	Scanner userinput= new Scanner(System.in);
        String str = userinput.nextLine();
        System.out.println(Stringcontainsvowels(str));
    }
    public static boolean Stringcontainsvowels(String in){
        return in.toLowerCase().matches(".*[aeiou].*");
    }
}