package java_fundamentals;
import java.util.*;
public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
	char c1 = s.nextLine().charAt(0);
	if((c1 >= 'A' && c1<= 'Z') ||(c1 >='a' && c1 <='z')) {
		System.out.println("Alphabet");
	}
	else if(c1 >='0' && c1<='9') {
		System.out.println("Number");
	}
	else
	{
		System.out.println("Spical character");
	}
	}

}
