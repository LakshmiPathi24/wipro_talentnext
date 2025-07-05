package java_fundamentals;
import java.util.*;
public class Question19 {
public static void main(String[] args) {
	for(int i=10;i<=99;i++) {
		int count = 0;
		for(int j = 2;j<=Math.sqrt(i);j++) {
			if(i%j==0) {
				count++;
				break;
			}
		}
		if(count==0&&i>1) {
			System.out.println(i);
		}
	}
}
}
