package java_fundamentals;
import java.util.*;
public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
String gen = sc.nextLine();
int age = sc.nextInt();
if(gen.equalsIgnoreCase("female")) {
	if (age >= 1 && age <= 58) {
        System.out.println("Interest: 8.2%");
    } else if (age >= 59 && age <= 100) {
        System.out.println("Interest: 9.2%");
    } else {
        System.out.println("Invalid age range.");
    }

}
else if(gen.equalsIgnoreCase("male")) {
	{
        if (age >= 1 && age <= 58) {
            System.out.println("Interest: 8.4%");
        } else if (age >= 59 && age <= 100) {
            System.out.println("Interest: 10.5%");
        } else {
            System.out.println("Invalid age range.");
        }
    }
}
else {
	System.out.println("invalid input");
}
	}

}
