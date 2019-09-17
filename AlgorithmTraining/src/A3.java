import java.util.Scanner;

public class A3 {
	
	public static void main(String[] args) {
		
		// 10원 50원 100원 500원 1,000원 5,000원 10,000원 50,000원
		Scanner sc = new Scanner(System.in);
		
		int [] moneys = {10, 50, 100, 500, 1000, 5000, 10000, 50000}; 
		
		int inputNum =  sc.nextInt();
		int remain = inputNum;
		int n = 0;
		
		for (int i=moneys.length; i>0; i--) {
			n += remain / moneys[i-1];
			remain %= moneys[i-1];
			
		}
		
		System.out.printf("%d", n);
		
	}
}
